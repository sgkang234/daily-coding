package Implementation;

// 26.03.30
// 백준 25206
// 학점 평균을 출력하는 프로그램

import java.util.Scanner;

public class _25206_YourGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalScore = 0.0; // (학점 × 평점) 합
        double totalCredit = 0.0; // 학점 합

        for (int i = 0; i < 20; i++) {
            String subject = sc.next(); // 과목명
            double credit = sc.nextDouble(); // 학점
            String grade = sc.next(); // 등급

            if (grade.equals("P")) continue; // P는 제외

            double score = 0.0;

            switch (grade) {
                case "A+": score = 4.5; break;
                case "A0": score = 4.0; break;
                case "B+": score = 3.5; break;
                case "B0": score = 3.0; break;
                case "C+": score = 2.5; break;
                case "C0": score = 2.0; break;
                case "D+": score = 1.5; break;
                case "D0": score = 1.0; break;
                case "F":  score = 0.0; break;
            }
            totalScore += credit * score;
            totalCredit += credit;
        }
        System.out.println(totalScore / totalCredit);
    }
}