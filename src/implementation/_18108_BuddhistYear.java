package implementation;

// 26.03.16
// 백준 18108
// 불기 입력 시 서기로 바꾸는 프로그램

/*
[입력]
2541

[출력]
1998
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _18108_BuddhistYear {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        // 로직
        int buddhistYear = year - 543;

        // 출력
        System.out.println(buddhistYear);
    }
}
