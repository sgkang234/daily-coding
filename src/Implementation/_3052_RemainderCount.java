package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26.03.25
// 백준 3052
// 정수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력 프로그램

public class _3052_RemainderCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42]; // true false 배열 생성해 42의 나머지가 있다면 true 없다면 false
        int count = 0;

        for (int i = 0; i <10 ; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[a%42] = true; // 입력받은 정수를 42로 나눈 나머지를 배열에 저장
        }

        for (int i = 0; i <42 ; i++) {
            if(arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
