package dp;

// 26.04.14
// 백준 10870
// 피보나치 수열을 구하는 프로그램
// f(n) = f(n-1) + f(n-2)

/*
[입력]
10

[출력]
55
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10870_Fibonacci {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 0){
            System.out.println(0);
            return;
        }

        // 로직
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <=n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        // 출력
        System.out.println(dp[n]);
    }
}
