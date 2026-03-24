package Implementation;

// 26.03.24
// 백준 2562
// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562_MaxValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        int index = 1;

        for (int i = 2; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            if(max < num){
                max = num;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
