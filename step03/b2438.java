package com.boj.step3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ���� 2438 ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "";
		
		for(int i=0;i<n;i++) {
			s += "*";
			System.out.println(s);
		}
		
	}

}