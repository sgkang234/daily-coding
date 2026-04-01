package implementation;

// 26.03.15
// 백준 10926
// 입력한 문자에 "??!"를 붙여 출력하는 프로그램

/*
[입력]
joonas

[출력]
joonas??!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10926_Surprised {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 출력
        System.out.println(input + "??!");
    }
}
