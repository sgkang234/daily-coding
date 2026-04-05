package bruteforce;

// 26.04.05
// 백준 19532
// 두 개의 일차방정식을 만족하는 정수 해 (x, y)를 완전탐색으로 구하는 문제

/*
[입력]
1 3 -1 4 1 7

[출력]
2 -1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _19532_SolveLinearEquations {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        
        // 로직 및 출력
        for (int x = -999; x <= 999 ; x++) {
            for (int y = -999; y <= 999 ; y++) {
                if( ( (a * x) + (b * y) == c ) && (d * x) + (e * y) == f ){
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
    }
}
