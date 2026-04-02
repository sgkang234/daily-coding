package math;

// 26.04.01
// 백준 9506
// 정수 N이 주어졌을 때, 소인수분해하는 프로그램

/*
[입력]
72

[출력]
2
2
2
3
3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11653_PrimeFactorization {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        int num = 2;
        while (n != 1){ // 소인수분해의 끝은 1이다.
            if(n % num == 0){
                n = n/num;
                sb.append(num)
                        .append("\n");
            }else{
                num++;
            }
        }

        // 출력
        System.out.println(sb);
    }
}