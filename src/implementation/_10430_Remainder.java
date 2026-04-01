package implementation;

// 26.03.16
// 백준 10430
// (A+B)%C는 ((A%C) + (B%C))%C, (A×B)%C는 ((A%C) × (B%C))%C 단 (2 ≤ A, B, C ≤ 10000) 일떄 이것이 같은 값인지 확인하는 프로그램

/*
[입력]
5 8 4

[출력]
1
1
0
0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10430_Remainder {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 출력
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}
