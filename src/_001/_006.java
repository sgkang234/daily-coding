package _001;

// 26.03.15
// 백준 10926번
// 입력한 문자에 ??!를 붙여 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(input + "??!");
    }
}
