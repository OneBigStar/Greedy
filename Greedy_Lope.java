package com.hdk.vhans;
import java.util.Scanner;
import java.util.Arrays;

public class Greedy_Lope {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int[] weights =new int[n];
		for(int i=0;i<n;i++) {
			weights[i]= scan.nextInt();
		}
		Arrays.sort(weights);

		int ans=0;
		int k=1;
		for(int i=n-1;i>=0;i--) {
			if(ans<weights[i]*k ) {
				ans=weights[i]*k;
			}
			k++;
		}
		System.out.print(ans);
	}

}
