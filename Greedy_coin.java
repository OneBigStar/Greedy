/*
  ���� - 11047
  �ر԰� ������ �ִ� ������ �� N�����̰�, ������ ������ �ſ� ���� ������ �ִ�.
  ������ ������ ����ؼ� �� ��ġ�� ���� K�� ������� �Ѵ�. �̶� �ʿ��� ���� ������ �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
