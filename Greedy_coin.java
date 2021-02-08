/*
  백준 - 11047
  준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
  동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 */
package greedy;
import java.util.Scanner;
public class Greedy_coin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int [] coin= new int[n];
		int k= scan.nextInt();
		int jud = 0;
		for(int i=0;i<n;i++) {
			coin[i]= scan.nextInt();
			if(coin[i]<k) jud=i;
		}
		int ans=0;
		for(int i=jud;i>=0;i--) {
			if(coin[i]<=k) {
				k= k-coin[i];
			    ans++;
				if(k<=0) break;
			}
			if(coin[i]<=k) i++;
		}
		System.out.println(ans);
	}
}
