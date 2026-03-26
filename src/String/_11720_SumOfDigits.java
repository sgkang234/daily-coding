package String;

// 26.03.26
// 백준 11720
// 첫째 줄에 숫자의 개수 정수 N이 주어지고, 둘째 줄부터 숫자 N개가 공백 없이 주어질 때 이 숫자를 모두 합해서 출력하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11720_SumOfDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += s.charAt(j) - '0'; // char끼리 연산하여 자동으로 int로 형변환
        }
        System.out.println(sum);
    }
}
