package test;

import java.util.Random;

public class test {
	public static void main(String[] args) {
		Random random=new Random();
		int sum = 0;
		int [][] arr = new int[3][4];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = random.nextInt(10);
				System.out.print(arr[i][j]+" \t");
				sum+=arr[i][j];
			}
			System.out.println();
		}
		System.out.println("합은 "+sum);
	}
}
