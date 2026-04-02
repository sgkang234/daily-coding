package math;

// 26.03.25
// 백준 1546
// 시험 과목의 개수 n이 주어지고, 시험 점수 중 최대값을 m이라고 했을때, 모든 점수를 점수/m*100으로 변경했을 때, 평균을 구하는 프로그램

/*
[입력]
3
40 80 60

[출력]
75.0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1546_Average {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 시험 과목의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 로직
        int max = 0; // 최대값
        double sum = 0;
        int[] arr = new int[n];

        // 시험 과목의 점수를 입력하고, 최대값을 찾는 반복문
        for (int i = 0; i <n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]){
                max = arr[i];
            }
        }

        // 모든 시험 성적 과목을 성적/m*100, 평균값을 저장하는 반복문
        for (int i = 0; i < n; i++) {
            sum += (double) arr[i] / max * 100;
        }

        // 출력
        System.out.println(sum/n);
    }
}
