package implementation;

// 26.03.23
// 백준 10952
// 정수 A, B를 입력받아 A와 B가 모두 0이 아닐 때까지 A+B를 출력하는 프로그램

/*
[입력]
1 1
2 3
3 4
0 0

[출력]
2
5
7
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10952_APlusB_5 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 로직
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }
            sb.append(a+b).append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
