grammar Pmm;

@header {
    import ast.language.*;
    import ast.expression.*;
    import ast.statement.*;
    import ast.type.*;
}

// Análisis Sintáctico


/*
   rule returns [ASTNode ast (=initialization)?] locals [Type variable (=initialization)?];
    nt=nonterminal T=token {$ast = $nt.ast $T.text $variable}
*/


// Programa

program returns [Program ast] locals [List<Definition> defs = new ArrayList<Definition>()]: definitions main EOF { $defs.addAll($definitions.ast); $defs.add($main.ast); $ast = new Program($defs, 1, 1); }
         ;
definitions returns [List<Definition> ast = new ArrayList<Definition>()]: /* epsilon */
             | definition definitions { $definitions.ast.addAll($definition.ast); $ast = $definitions.ast; }
             ;
main returns [FuncDefinition ast]: OP='def' NAME='main' '(' ')' ':' '{' statements '}' { $ast = new FuncDefinition($NAME.text, VoidType.getInstance(), $statements.ast, $OP.getLine(), $OP.getCharPositionInLine() + 1); }
      ;

// Definiciones
definition returns [List<Definition> ast = new ArrayList<Definition>()]: var_definition { $ast.addAll($var_definition.ast); }
            | func_definition { $ast.add($func_definition.ast); }
            ;

// Definición de variable
var_definition returns [List<Statement> ast = new ArrayList<Statement>()]: ids ':' type ';' { $ids.ast.stream().forEach((id) -> $ast.add(new VarDefinition(id.name, $type.ast, id.getLine(), id.getColumn()))); }
                ;
var_definitions returns [List<Statement> ast = new ArrayList<Statement>()]: /* epsilon */
                 | var_definition var_definitions { $var_definitions.ast.addAll($var_definition.ast); $ast = $var_definitions.ast; }
                 ;

// Definición de funciones
func_definition returns [FuncDefinition ast] locals [Type t = VoidType.getInstance()]: OP='def' ID '(' func_params ')' ':' ((type) { $t = $type.ast; })? '{' statements '}' { $ast = new FuncDefinition($ID.text, $t, $statements.ast, $OP.getLine(), $OP.getCharPositionInLine() + 1); }
                 ;
func_params returns [List<Statement> ast = new ArrayList<Statement>()]: params { $ast = $params.ast; }
        | /* epsilon */
        ;
params returns [List<Statement> ast = new ArrayList<Statement>()]: param { $ast.add($param.ast); }
        | param ',' params { $params.ast.add($param.ast); $ast = $params.ast; }
        ;
param returns [VarDefinition ast]: ID ':' simple_type { $ast = new VarDefinition($ID.text, $simple_type.ast, $ID.getLine(), $ID.getCharPositionInLine() + 1); }
        ;

// Tipos
type returns [Type ast]: simple_type { $ast = $simple_type.ast; } | complex_type { $ast = $complex_type.ast; }
      ;
complex_type returns [Type ast]: array_type { $ast = $array_type.ast; }
              | struct_type { $ast = $struct_type.ast; }
              ;
array_type returns [ArrayType ast]: dimension type { $ast = new ArrayType($dimension.ast, $type.ast, $type.ast.getLine(), $type.ast.getColumn()); } // Se podría intentar mejorar línea y columna
            ;
dimension returns [int ast]: '[' INT_CONSTANT ']' { $ast = LexerHelper.lexemeToInt($INT_CONSTANT.text); }
           ;
struct_type returns [StructType ast]: OP='struct' '{' registers '}' { $ast = new StructType($registers.ast, $OP.getLine(), $OP.getCharPositionInLine() + 1); }
             ;
registers returns [List<RecordField> ast = new ArrayList<RecordField>()]: /* epsilon */
           | register registers { $registers.ast.addAll($register.ast); $ast = $registers.ast; }
           ;
register returns [List<RecordField> ast = new ArrayList<RecordField>()]: ids ':' type ';' { $ids.ast.stream().forEach((id) -> $ast.add(new RecordField(id.name, $type.ast, id.getLine(), id.getColumn()))); }
          ;
simple_type returns [Type ast]: 'int' { $ast = IntType.getInstance(); }
      | 'char' { $ast = CharType.getInstance(); }
      | 'double' { $ast = DoubleType.getInstance(); }
      ;

// Sentencias
statements returns [List<Statement> ast = new ArrayList<Statement>()]: /* epsilon */
            | statement statements { $statements.ast.addAll($statement.ast); $ast = $statements.ast; }
            ;

statement returns [List<Statement> ast = new ArrayList<Statement>()]: OP='print' separated_expressions ';' { $separated_expressions.ast.stream().forEach((expression) -> $ast.add(new Print(expression, $OP.getLine(), $OP.getCharPositionInLine() + 1))); }
           | OP='input' separated_expressions ';' { $separated_expressions.ast.stream().forEach((expression) -> $ast.add(new Input(expression, $OP.getLine(), $OP.getCharPositionInLine() + 1))); }
           | left=expression '=' right=expression ';' { $ast.add(new Assignment($left.ast, $right.ast, $left.ast.getLine(), $left.ast.getColumn())); }
           | if_else { $ast.add($if_else.ast); }
           | while_loop { $ast.add($while_loop.ast); }
           | OP='return' expression ';' { $ast.add(new Return($expression.ast, $OP.getLine(), $OP.getCharPositionInLine() + 1)); }
           | func_invocation ';' { $ast.add($func_invocation.ast); }
           | var_definition { $ast.add($var_definition.ast); }
           ;
if_else returns [IfElse ast] locals [List<Statement> elseBody = new ArrayList<Statement>()]: OP='if' condition=expression ':' (('{' body=statements '}') | body=statements) (else_statement { $elseBody.addAll($else_statement.ast); })? { $ast = new IfElse($condition.ast, $body.ast, $elseBody, $OP.getLine(), $OP.getCharPositionInLine() + 1); }
    ;
else_statement returns [List<Statement> ast = new ArrayList<Statement>()]: 'else' ':' ('{' body=statements '}' | body=statements) { $ast.addAll($body.ast); }
      ;
while_loop returns [While ast]: OP='while' expression ':' ('{' st=statements '}' | st=statements) { $ast = new While($expression.ast, $st.ast, $OP.getLine(), $OP.getCharPositionInLine() + 1); }
       ;
// También es una expresión (si retorna un valor)
func_invocation returns [FunctionInvocation ast]: ID '(' arguments ')' { $ast = new FunctionInvocation($ID.text, $arguments.ast, $ID.getLine(), $ID.getCharPositionInLine() + 1); }
                 ;
arguments returns [List<Expression> ast = new ArrayList<Expression>()]: /* epsilon */
    | separated_expressions { $ast = $separated_expressions.ast; };

separated_expressions returns [List<Expression> ast = new ArrayList<Expression>()]: expression { $ast.add($expression.ast); }
                       | expression ',' separated_expressions { $separated_expressions.ast.add($expression.ast); $ast = $separated_expressions.ast; }
                       ;
expression returns [Expression ast]: func_invocation { $ast = $func_invocation.ast; }
            | INT_CONSTANT { $ast = new LitInt($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
            | CHAR_CONSTANT { $ast = new LitChar($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
            | REAL_CONSTANT { $ast = new LitDouble($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
            | '(' expression ')' { $ast = $expression.ast; }
            | left=expression '[' right=expression ']' { $ast = new ArrayAccess($left.ast, $right.ast, $left.ast.getLine(), $left.ast.getColumn()); }
            | left=expression '.' ID { $ast = new StructAccess($left.ast, $ID.text, $left.ast.getLine(), $left.ast.getColumn()); }
            | OP='(' simple_type ')' expression { $ast = new Cast($expression.ast, $simple_type.ast, $OP.getLine(), $OP.getCharPositionInLine() + 1); }
            | OP='-' left=expression { $ast = new MinusUnary($left.ast, $OP.getLine(), $OP.getCharPositionInLine() + 1); }
            | OP='!' left=expression { $ast = new Not($left.ast, $OP.getLine(), $OP.getCharPositionInLine() + 1); }
            | left=expression OP=('*' | '/' | '%') right=expression { $ast = new Arithmetic($left.ast, $OP.text, $right.ast, $left.ast.getLine(), $left.ast.getColumn()); }
            | left=expression OP=('+' | '-') right=expression { $ast = new Arithmetic($left.ast, $OP.text, $right.ast, $left.ast.getLine(), $left.ast.getColumn()); }
            | left=expression OP=('>' | '>=' | '<' | '<=' | '!=' | '==') right=expression { $ast = new Logical($left.ast, $OP.text, $right.ast, $left.ast.getLine(), $left.ast.getColumn()); }
            | left=expression OP='&&' right=expression { $ast = new Logical($left.ast, $OP.text, $right.ast, $left.ast.getLine(), $left.ast.getColumn()); }
            | left=expression OP='||' right=expression { $ast = new Logical($left.ast, $OP.text, $right.ast, $left.ast.getLine(), $left.ast.getColumn()); }
            | ID { $ast = new Var($ID.text, $ID.getLine(), $ID.getCharPositionInLine() + 1); }
            ;
ids returns [List<Var> ast = new ArrayList<Var>()]: ID { $ast.add(new Var($ID.text, $ID.getLine(), $ID.getCharPositionInLine() + 1)); }
     | ID ',' ids { $ids.ast.add(new Var($ID.text, $ID.getLine(), $ID.getCharPositionInLine() + 1)); $ast = $ids.ast; }
     ;


// Análisis Léxico

WS: [ \t\r\n]+ -> skip;
SL_COMMENT: '#' .*? ('\n' | '\r' | EOF) -> skip;
ML_COMMENT: '"""' .*? '"""' -> skip;

ID: (LETTER | '_') (LETTER | DIGIT | '_')*;
INT_CONSTANT: '0' | [1-9] [0-9]*;
REAL_CONSTANT:  E_DOUBLE
                | DEFAULT_DOUBLE
                | POINT_DOUBLE
                | DOUBLE_POINT;
CHAR_CONSTANT: '\'' (CHARACTER | ASCII | SPECIAL_CHAR) '\'';


fragment
DEFAULT_DOUBLE: INT_CONSTANT '.' NUMBER;
fragment
POINT_DOUBLE: '.' NUMBER;
fragment
DOUBLE_POINT: INT_CONSTANT '.';
fragment
E_DOUBLE: (DEFAULT_DOUBLE | POINT_DOUBLE | DOUBLE_POINT | INT_CONSTANT) ('E' | 'e') ('+' | '-')? INT_CONSTANT;
fragment
LETTER: [a-zA-Z];
fragment
CHARACTER: .;
fragment
DIGIT: [0-9];
fragment
NUMBER: [0-9]*;
fragment
ASCII: '\\' NUMBER;
fragment
SPECIAL_CHAR: '\\n' | '\\r' | '\\t';
