package strings;

// 26.03.26
// 백준 9086
// 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램

/*
[입력]
3
ACDKJFOWIEGHE
O
AB

[출력]
AE
OO
AB
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9086_FirstAndLastChar {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            sb.append(s.charAt(0))
                    .append(s.charAt(s.length()-1))
                    .append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
