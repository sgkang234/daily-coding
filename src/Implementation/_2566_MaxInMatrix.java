package Implementation;

// 26.03.30
// 백준 2566
// 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2566_MaxInMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int y = 0;

        int max = -1;
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
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
