package strings;

// 26.03.28
// 백준 5622
/*
ABC → 3초
DEF → 4초
GHI → 5초
JKL → 6초
MNO → 7초
PQRS → 8초
TUV → 9초
WXYZ → 10초
사용자가 입력한 알파벳 문자열을 각 영단어에 따라 초를 재는 프로그램
*/

/*
[입력]
WA

[출력]
13
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5622_Dial {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 로직
        int time = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // 문자열을 문자로 형변환

            if (c >= 'A' && c <= 'C') time += 3;
            else if (c <= 'F') time += 4;
            else if (c <= 'I') time += 5;
            else if (c <= 'L') time += 6;
            else if (c <= 'O') time += 7;
            else if (c <= 'S') time += 8;
            else if (c <= 'V') time += 9;
            else if (c <= 'Z') time += 10;
        }

        // 출력
        System.out.println(time);
    }
}
