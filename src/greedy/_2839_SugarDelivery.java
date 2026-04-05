package greedy; // 5키로부터 줄여나가기에 greedy

// 26.04.05
// 백준 2839
// 3kg과 5kg 봉지를 이용해 설탕을 정확히 배달할 때 최소 봉지 수를 구하는 프로그램

/*
[입력]
18

[출력]
4
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2839_SugarDelivery {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kg = Integer.parseInt(br.readLine());

        // 로직 및 출력
        int envelope = 0;
        while (true) {
            if (kg % 5 == 0) {
                envelope += kg / 5;
                System.out.println(envelope);
                return;
            } else {
                kg -= 3;
                envelope++;
                if (kg < 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
    }
}
