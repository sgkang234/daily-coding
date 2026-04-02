package math;

// 26.04.02
// 백준 15894
// 주어진 규칙에서 도형의 둘레 길이를 계산하는 프로그램

/*
[입력]
3

[출력]
12
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15894_MathIsPhysicalEducation {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        // 출력
        System.out.println(n * 4);
    }
}
