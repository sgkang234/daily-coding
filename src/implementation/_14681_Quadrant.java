package implementation;

// 26.03.18
// 백준 14681
// 사분면 ++ , -+, --, +- 확인하는 프로그램

/*
[입력]
12
5

[출력]
1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14681_Quadrant {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // 로직 및 출력
        if (x > 0 && y > 0){
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else{
            System.out.println(4);
        }
    }
}
