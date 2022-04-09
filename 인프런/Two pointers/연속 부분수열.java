import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int lt = 0;
		int sum = 0;
		int cnt = 0;
		for(int rt=0; rt<n; rt++) {
			sum+=arr[rt];
			if(sum==m) cnt++;
			while(sum>=m) {
				sum-=arr[lt++];
				if(sum==m) cnt++;
			}
			
		}

		System.out.println(cnt);

	}
}