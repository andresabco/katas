package com.hackercamp.katas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListPermutationsTest {

	@Test
	void testGetPermutations() {
		// given
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		int size = 3;
		List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 4),
				Arrays.asList(1, 3, 4), Arrays.asList(2, 3, 4));
		// when
		List<List<Integer>> resultList = ListPermutations.getPermutations(list, size);

		// then
		assertEquals(expectedList, resultList);
	}

}
