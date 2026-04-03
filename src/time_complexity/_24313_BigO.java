package time_complexity;

// 26.04.03
// 백준 24313
// 주어진 함수가 특정 상수 c와 n₀에 대해 O(g(n))을 만족하는지 판별하는 프로그램

/*
[입력]
7 7
8
1

[출력]
0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _24313_BigO {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        // 로직 및 출력
        if (a1 <= c && a1 * n0 + a0 <= c * n0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
