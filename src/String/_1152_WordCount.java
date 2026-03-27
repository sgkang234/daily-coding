package String;

// 26.03.27
// 백준 1152
// 문자열로 된 알파벳 단어가 몇번 등장하는지 횟수를 출력하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1152_WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 공백 자동 처리
        System.out.println(st.countTokens());
    }
}
