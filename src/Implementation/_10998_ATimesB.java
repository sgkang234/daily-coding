package Implementation;

// 26.03.14
// 백준 10998번
// 두 정수 A와 B를 입력 받은 다음, A*B를 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10998_ATimesB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        System.out.println(A * B);
    }
}
