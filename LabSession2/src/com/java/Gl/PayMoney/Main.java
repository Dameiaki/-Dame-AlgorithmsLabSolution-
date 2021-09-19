package com.java.Gl.PayMoney;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of transaction");
		int size = in.nextInt();
		int transactions[] = new int[size];
		System.out.println("Enter the transactions");
		for (int i = 0; i < transactions.length; i++) {
			transactions[i] = in.nextInt();
		}
		System.out.println("Enter the total number of targets to achieve");
		int noOfTargets = in.nextInt();
		int i = 0;
		while (i++ < noOfTargets) {
			System.out.println("Enter target to achieve");
			int tar = in.nextInt();
			PayMoney payMoney = new PayMoney();
			int transactionCount = payMoney.transactionCount(transactions, tar);
			if (transactionCount == -1)
				System.out.println("Target not achieved");
			else
				System.out.println("Target is achievable after " + transactionCount + " transactions");
		}
		
		in.close();
	}

}
