/*
  ���� - 1946
 ������ �ְ��� �����ϴ� ������ ���� ���� �ֽ�ȸ�簡 �ű� ��� ä���� �ǽ��Ѵ�. ���� ���� ������ 1�� �����ɻ�� 2�� ������������ �̷������. 
 �ְ��� �����Ѵٴ� ����� �̳信 ���� �׵��� �ְ��� ����鸸�� ������� �����ϰ� �;� �Ѵ�.
 �׷��� ���� �ֽ�ȸ���, �ٸ� ��� �����ڿ� ������ �� �����ɻ� ������ �������� ���� �� ��� �ϳ��� �ٸ� �����ں��� �������� �ʴ� �ڸ� �����Ѵٴ� ��Ģ�� ������. 
 ��, � ������ A�� ������ �ٸ� � ������ B�� ������ ���� ���� �ɻ� ����� ���� ������ ��� �������ٸ� A�� ���� ���ߵ��� �ʴ´�.
 �̷��� ������ ������Ű�鼭, ���� �ֽ�ȸ�簡 �̹� �ű� ��� ä�뿡�� ������ �� �ִ� ���Ի���� �ִ� �ο����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

package com.hdk.vhans;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy_Employee {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test_num= Integer.parseInt(bf.readLine());
		for(int k=0;k<test_num;k++) {
			int n= Integer.parseInt(bf.readLine());
			int[][] cs= new int[n][2];
			for(int i=0;i<n;i++) {
				String val = bf.readLine();
				cs[i][0]= Integer.parseInt(val.split(" ")[0]); 
				cs[i][1]= Integer.parseInt(val.split(" ")[1]);
			}
			
			Arrays.sort(cs, new Comparator<int[]>() {
			    @Override
				public int compare(int[] o1, int[] o2) {
			    	 return o1[0] - o2[0]; 
		           }
		        });
			int roof=cs[0][1];
			int ans=1;
			for (int i=1;i<n;i++) {
				if(roof>cs[i][1]) {
					ans++;
					roof= cs[i][1];
				}
			}
			System.out.println(ans);
		}
	}

}
