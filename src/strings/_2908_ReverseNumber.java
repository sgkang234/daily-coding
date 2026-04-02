package strings;

// 26.03.27
// 백준 2908
// 두 수를 입력하면 (734, 893) 이를 (437, 398) 역수 생각해 두 수 중 더 큰 수를 입력하는 프로그램

/*
[입력]
734 893

[출력]
437
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2908_ReverseNumber {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 로직
        String a = new StringBuilder(st.nextToken()).reverse().toString();
        String b = new StringBuilder(st.nextToken()).reverse().toString();

        // 출력
        System.out.println(Math.max(Integer.parseInt(a), Integer.parseInt(b)));
    }
}
