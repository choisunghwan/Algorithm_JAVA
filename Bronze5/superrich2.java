package Bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class superrich2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        /*문제에서 입력값 범위가(1 ≤ m ≤ n ≤ 101000, m과 n은 10진수 정수) 이므로 biginteger사용  */
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.divide(b));
        System.out.println(a.mod(b));
        sc.close();

        /*내가 처음 시도했던 코드 : 입력되는 숫자의 범위로 인해 게속 실패 했었다. */
        // 입력
        // Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();
        // int B = sc. nextInt();
        // 출력
        // System.out.println(A/B); // 몫 출력
        // System.out.println(A%B); //나머지 출력
        // sc.close();
    }
}
