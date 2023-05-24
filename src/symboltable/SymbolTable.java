package symboltable;

import java.util.*;
import ast.Definition;

public class SymbolTable {
	
	private int scope=0;
	private final List<Map<String,Definition>> tableList;

	public SymbolTable()  {
		tableList = new ArrayList<>();
		tableList.add(new HashMap<>());
	}

	public void set() {
		scope += 1; // Se incrementa el scope

		tableList.add(new HashMap<>()); // Se añade un nuevo mapa al final de la tabla
	}
	
	public void reset() {
		tableList.remove(scope); // Se elimina el último mapa en la tabla

		scope -= 1; // Se decrementa el scope
	}
	
	public boolean insert(Definition definition) {
		if (tableList.get(scope).containsKey(definition.getName())) {
			return false;
		} // Si ya existe se devuelve false
		tableList.get(scope).put(definition.getName(), definition);
		definition.setScope(scope);
		return true; // Si no existe se devuelve true
	}
	
	public Definition find(String id) {
		for (int i = scope; i >= 0; i--) {
			if (tableList.get(i).containsKey(id)) {
				return tableList.get(i).get(id);
			} // Si existe se devuelve
		} // Se busca el id desde el scope más interno hasta el más externo
		return null; // Si no existe se devuelve null
	}

	// For testing purposes only
	public Definition findInCurrentScope(String id) {
		if (tableList.get(scope).containsKey(id)) {
			return tableList.get(scope).get(id);
		} // Si existe se devuelve
		return null; // Si no existe se devuelve null
	}
}
