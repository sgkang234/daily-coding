package _001;

import java.util.Arrays;
import java.util.Scanner;

// 26.03.19
// 백준 2480
/*
3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
*/
public class _019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (arr[0] == arr[2]) { // 모두 같음
            System.out.println(10000 + arr[0] * 1000);
        } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
            System.out.println(1000 + arr[1] * 100);
        } else {
            System.out.println(arr[2] * 100);
        }
    }
}
