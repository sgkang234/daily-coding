package String;

// 26.03.29
// 백준 2941
// 크로아티아 알파벳 해당 문제는 백준에 가서 직접 보는 것을 추천

import java.util.Scanner;

public class _2941_CroatianAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] cro = {
                "c=", "c-", "dz=", "d-",
                "lj", "nj", "s=", "z="
        };

        for (int i = 0; i < cro.length; i++) {
            s = s.replace(cro[i], "*"); // 하나의 문자로 치환
        }

        System.out.println(s.length());
    }
}
