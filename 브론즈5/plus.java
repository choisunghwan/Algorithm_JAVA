package 브론즈5;

import java.util.Scanner;

public class plus {
    public static void main(String[] args) {
        
        //변수 
        int A;
        int B;
        
        //입력 받기
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println(A+B);

        sc.close();
    }
}
