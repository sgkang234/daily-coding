package implementation;

// 26.03.30
// 백준 2566
// 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램

/*
[입력]
3 23 85 34 17 74 25 52 65
10 7 39 42 88 52 14 72 63
87 42 18 78 53 45 18 84 53
34 28 64 85 12 16 75 36 55
21 77 45 35 28 75 90 76 1
25 87 65 15 28 11 37 28 74
65 27 75 41 7 89 78 64 39
47 47 70 45 23 65 3 41 44
87 13 82 38 31 12 29 29 80

[출력]
90
5 7
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2566_MaxInMatrix {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 로직
        int x = 0;
        int y = 0;
        int max = -1; // 입력은 모두 자연수이기에 -1로 초기 설정
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9 ; j++) {
                int now = Integer.parseInt(st.nextToken());
                if(max < now){
                    max = now;
                    x = i+1; // 행은 1부터 시작하기에 +1
                    y = j+1;
                }
            }
        }
        
        // 출력
        System.out.println(max + "\n" + x + " " + y);
    }
}
