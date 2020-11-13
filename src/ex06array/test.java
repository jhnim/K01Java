package ex06array;

import java.util.Random;
import java.util.Scanner;


	
public class test{
	
	public static void arrPrint(int[][] arr) {
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args){		
		
		int[][] arr = new int[3][3];
		
		int initVal = 1;
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = initVal++;
			}
		}
		
		arrPrint(arr);
		
		rotateArr(arr);
		arrPrint(arr);
		
		rotateArr(arr);
		arrPrint(arr);
		
		rotateArr(arr);
		arrPrint(arr);
		
	}
	
	
	public static void rotateArr(int[][] arr) {
		
		int[] lastRow = arr[arr.length-1];
		
		for(int row = arr.length-1 ; row>0 ; row--){
			arr[row] = arr[row-1];
		}
		
		arr[0] = lastRow;
	}
}

