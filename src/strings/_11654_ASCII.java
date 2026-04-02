package strings;

// 26.03.26
// 백준 11654
// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램

/*
[입력]
A

[출력]
65
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11654_ASCII {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);

        // 출력
        System.out.println((int)c);
    }
}
