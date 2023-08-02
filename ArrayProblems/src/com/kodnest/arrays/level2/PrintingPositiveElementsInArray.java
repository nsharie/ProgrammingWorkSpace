package com.kodnest.arrays.level2;

import java.util.Scanner;

public class PrintingPositiveElementsInArray {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of Array");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter "+arr.length+" Elements to store in Array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array Contents Are....");
		for (int i : arr) {
			if(i>0) {
				System.out.print(i+" ");
			}
		}
	}
}
