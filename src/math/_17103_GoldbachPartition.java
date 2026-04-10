package math;

// 26.04.10
// 백준 17103
// 주어진 짝수를 두 소수의 합으로 나타내는 경우의 수를 구하는 프로그램 (골드바흐 파티션)

/*
[입력]
5
6
8
10
12
100

[출력]
1
1
2
1
6
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _17103_GoldbachPartition {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(br.readLine());
        int max = 1000000;

        // 로직
        StringBuilder sb = new StringBuilder();
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        // 에라토스테네스의 체
        for (int i = 2; i *i <= max; i++) {
            if(isPrime[i]){ // 실수라면
                for (int j = i*i; j <= max; j+= i) {
                    if(isPrime[j]){
                        isPrime[j] = false;
                    }
                }
            }
        }

        for (int i = 0; i < caseCount; i++) {
            int count = 0;
            int num = Integer.parseInt(br.readLine());

            for (int j = 2; j <= num / 2; j++) {
                if (isPrime[j] && isPrime[num - j]) {
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
