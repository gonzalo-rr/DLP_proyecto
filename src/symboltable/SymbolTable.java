package symboltable;

import java.util.*;
import ast.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;

	public SymbolTable()  {
		table = new ArrayList<Map<String,Definition>>();
		table.add(new HashMap<String, Definition>());
	}

	public void set() {
		scope += 1; // Se incrementa el scope

		table.add(new HashMap<String, Definition>()); // Se añade un nuevo mapa al final de la tabla
	}
	
	public void reset() {
		scope -= 1; // Se decrementa el scope

		table.remove(table.size() - 1); // Se elimina el último mapa en la tabla
	}
	
	public boolean insert(Definition definition) {
		if (table.get(table.size() - 1).containsKey(definition.getName())) {
			return false;
		} // Si ya existe se devuelve false
		table.get(table.size() - 1).put(definition.getName(), definition);
		definition.setScope(scope);
		return true; // Si no existe se devuelve true
	}
	
	public Definition find(String id) {
		for (int i = table.size() - 1; i >= 0; i--) {
			if (table.get(i).containsKey(id)) {
				return table.get(i).get(id);
			} // Si existe se devuelve
		} // Se busca el id desde el scope más interno hasta el más externo
		return null; // Si no existe se devuelve null
	}

	public Definition findInCurrentScope(String id) {
		if (table.get(scope).containsKey(id)) {
			return table.get(scope).get(id);
		} // Si existe se devuelve
		return null; // Si no existe se devuelve null
	}
}
