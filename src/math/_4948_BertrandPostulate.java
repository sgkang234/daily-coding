package math;

// 26.04.10
// 백준 4948
// 주어진 수 n에 대해 n보다 크고 2n 이하인 소수의 개수를 구하는 프로그램

/*
[입력]
1
10
13
100
1000
10000
100000
0

[출력]
1
4
3
21
135
1033
8392
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _4948_BertrandPostulate {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 로직
        StringBuilder sb = new StringBuilder();
        int max = (123456 * 2);
        boolean[] isPrime = new boolean[max+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i  <= max ; i++) {
            if(isPrime[i]){
                for (int j = i*i; j <= max; j+= i) {
                    isPrime[j] = false;
                }
            }
        }

        while (true){
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            if (n == 0){
                break;
            }
            for (int i = n+1; i <= n*2; i++) { // n은 포함하지 않는다.
                if(isPrime[i]){
                    count++;
                }
            }
            sb.append(count)
                    .append("\n");
        }

        // 출력
        System.out.print(sb);
    }
}
