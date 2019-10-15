package com.hackercamp.katas.edgar;

import java.util.Arrays;
import java.util.List;

import com.hackercamp.katas.utils.Utils;

public class ListPermutations {

	/**
	 * Dado una lista de enteros, queremos obtener todas las permutaciones de tamaño
	 * "size". Ejemplo: list: [1,2,3,4] size: 3 return: [[1,2,3], [1,2,4], [1,3,4],
	 * [2,3,4]]
	 * 
	 * list: [1,2,3,4] size: 2 return: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
	 * 
	 * list: [1,2,3,4] size: 10 return: null
	 * 
	 * @param list: lista de enteros de los cuales se deben obtener las
	 *              permutaciones
	 * @param size: tamaño de las sub-listas
	 * @return lista de las distintas permutaciones (que a su vez son listas de
	 *         enteros)
	 */
	public static List<List<Integer>> getPermutations(List<Integer> list, int size) {
		return null;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		int size = 3;
		// deberia retornar [[1,2,3], [1,2,4], [1,3,4], [2,3,4]]
		Utils.printResult(ListPermutations.getPermutations(list, size));
	}
}
