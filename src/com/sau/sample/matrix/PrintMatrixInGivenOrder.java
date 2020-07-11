package com.sau.sample.matrix;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintMatrixInGivenOrder {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
				{17,18,19,20}
				
		};
		
		System.out.println("Solution 1");
		solution_2(matrix);	
		System.out.println("\n\nSolution 2");
		solution_2(matrix);		
		System.out.println("\n\nSolution 3");
		solution_2(matrix);	

	}
	
	public static void solution_1(int[][] matrix) {
		int i = 0;
		
		while (i < matrix.length) {
			
			int rowLength = matrix[i].length;

			boolean isOddRow = i == 0 || i % 2 == 0;

			if (isOddRow) {

				for (int j = 0; j < rowLength; j++) {
					System.out.print(matrix[i][j] + ", ");
				}
			} else {
				for (int j = rowLength -1 ; j >= 0 ; j--) {
					System.out.print(matrix[i][j] + ", "); 
				}
			}

			i++;
		} 	
	} 
	
	
	public static void solution_2(int[][] matrix) {
		int i = 0;
		
		while (i < matrix.length) {

			int rowLength = matrix[i].length;

			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			
			// This if condition is to handle odd number of rows.
			// For matrix with even rows only this condition is not required.
			if (i + 1 < matrix.length) {

				for (int j = matrix[i + 1].length - 1; j >= 0; j--) {
					System.out.print(matrix[i + 1][j] + ", ");
				}
			}

			i += 2;
		} 	
	} 
	
	
	public static void Solution_3(int[][] matrix) {
		boolean flipFlop = true;
		int i = 0;
		
		while (i < matrix.length) {
			
			if (flipFlop) {
				Arrays.stream(matrix[i]).forEach(s -> System.out.print(s + ", "));
				flipFlop = false;
			}
			else {
				List<Integer> listFromArray = Arrays.stream(matrix[i]).mapToObj(s -> Integer.valueOf(s)).collect(Collectors.toList());
				Collections.reverse(listFromArray);
				listFromArray.stream().forEach(s -> System.out.print(s + ", "));
				flipFlop = true;
			}
			
			i++;
			
		} 
	} 

}
