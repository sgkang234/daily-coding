package implementation;

// 26.04.13
// 백준 2558
// 두 줄에 입력된 두 정수를 더하는 프로그램

/*
[입력]
1
2

[출력]
3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2558_APlusB2 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        // 출력
        System.out.println(a+b);
    }
}
