package implementation;

// 26.03.25
// 백준 5597
// 30명의 학생 중 과제를 제출하지 않은 2명의 학생 번호 출력 프로그램

/*
[입력]
3
1
4
5
7
9
6
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30

[출력]
2
8
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5597_MissingStudents {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 로직
        boolean[] arr = new boolean[30]; // 전체 반의 인원 수
        // 총 인원 30명 중 제출한 28명만 true
        for (int i = 0; i < 28; i++) { // 총 제출자 28명
            int n = Integer.parseInt(br.readLine());
            arr[n-1] = true;
        }

        // 출력
        for (int i = 0; i < 30; i++) {
            if (!arr[i]) {
                System.out.println(i+1);
            }
        }
    }
}
