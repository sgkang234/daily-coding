package time_complexity;

// 26.04.03
// 백준 24267
// 세 겹 반복문의 변형 구조에서 실행 횟수(n(n-1)(n-2)/6)와 시간복잡도(O(n³))를 출력하는 프로그램
/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 2
        for j <- i + 1 to n - 1
            for k <- j + 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}
결국 최고차항이 n³이다.
따라서 시간 복잡도는 O(n³)이다.
*/

/*
[입력]
7

[출력]
35
3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24267_AlgorithmClass6 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        // 출력
        System.out.println(n * (n - 1) * (n - 2) / 6);
        System.out.println(3);
    }
}
