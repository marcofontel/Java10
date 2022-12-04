package org.arca.inferenciatipo;

import java.util.List;

public class InferenciaTipo {

	public static void main(String[] args) {

		var listaFruta = List.of("Banana", "Pera", "Uva", "Maçã", "Salada Mista");
		for(var fruta: listaFruta) {
			System.out.println(fruta);
		}
		
	}
}
