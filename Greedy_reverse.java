/*
 ���� -1439
 �ټ��̴� 0�� 1�θ� �̷���� ���ڿ� S�� ������ �ִ�. �ټ��̴� �� ���ڿ� S�� �ִ� ��� ���ڸ� ���� ���� ������� �Ѵ�. 
 �ټ��̰� �� �� �ִ� �ൿ�� S���� ���ӵ� �ϳ� �̻��� ���ڸ� ��� ��� ������ ���̴�. ������ ���� 1�� 0����, 0�� 1�� �ٲٴ� ���� �ǹ��Ѵ�.
���� ��� S=0001100 �� ��, ��ü�� �������� 1110011�� �ȴ�.
4��° ���ں��� 5��° ���ڱ��� �������� 1111111�� �Ǿ 2�� ���� ��� ���� ���ڷ� ���� �� �ִ�.
������, ó������ 4��° ���ں��� 5��° ���ڱ��� ���ڸ� �������� �� ���� 0000000�� �Ǿ 1�� ���� ��� ���� ���ڷ� ���� �� �ִ�.
���ڿ� S�� �־����� ��, �ټ��̰� �ؾ��ϴ� �ൿ�� �ּ� Ƚ���� ����Ͻÿ�.
 */
package com.hdk.vhans;
import java.util.Scanner;
public class Greedy_reverse {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String s=scan.next();
		String[] array = s.split("");
		int ans=0;
		for(int i=1;i<array.length;i++) {
			if(!array[i].equals(array[i-1])) ans++;
		}
		if(ans%2==1) ans=ans/2+1;
		else ans=ans/2;
		System.out.println(ans);
	}
}
