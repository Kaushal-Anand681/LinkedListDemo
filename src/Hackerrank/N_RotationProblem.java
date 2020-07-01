package Hackerrank;

import java.util.Scanner;

public class N_RotationProblem {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = { 1, 2, 3, 4, 5 };

		int[] arr = new int[a.length];
			for (int i = 0; i < a.length; i++) {
				arr[i] = a[(i + d) % arr.length];
			}
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

	}

}
