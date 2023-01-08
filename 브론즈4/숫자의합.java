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
            // sum+= a.charAt(i)-'0';
            sum+= a.charAt(i)-48;
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

/*
✍아스키코드를 활용하여 정수형 데이터를 문자열로 변경할 수 있다.

예를 들어 65라는 정수형 데이터를 문자(string)으로 타입캐스팅 처리한다면 결과는 'A' 간 나온다.


  */