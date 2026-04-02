package math;

// 26.04.02
// 백준 5073
// 세 변의 길이를 보고 삼각형의 종류를 판별하는 프로그램

/*
[입력]
7 7 7
6 5 4
3 2 5
6 2 6
0 0 0

[출력]
Equilateral
Scalene
Invalid
Isosceles
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5073_TriangleAndSides {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 로직
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // 종료 조건
            if(a == 0 && b == 0 && c == 0){
                break;
            }
            // 가장 긴 변 찾기
            int max = Math.max(a, Math.max(b, c));
            // 삼각형 성립 조건 체크 가장 긴 변의 길이는 나머지 변의 길이의 합보다 작아야 한다.
            if(max >= (a + b + c - max)){
                sb.append("Invalid").append("\n");
            }
            else if(a == b && b == c){
                sb.append("Equilateral").append("\n");
            }
            else if(a == b || a == c || b == c){
                sb.append("Isosceles").append("\n");
            }
            else {
                sb.append("Scalene").append("\n");
            }
        }

        // 출력
        System.out.print(sb);
    }
}
