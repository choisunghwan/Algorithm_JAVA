package 브론즈4;

import java.util.Scanner;

public class 숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // System.out.println("로그찍기" + N);
        String a = sc.next();
        sc.close();

        int sum = 0;
        
        for (int i =0; i<N; i++){
            sum+= a.charAt(i)-'0';
        }
        System.out.print(sum);
    }
}

/* 예제 입력
5
54321
 */

/*
출력결과
15
 */