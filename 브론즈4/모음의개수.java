package 브론즈4;

import java.util.Scanner;

/**
 * 모음의개수
 */
public class 모음의개수 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //📌nextLine 와 next 차이점?
        
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i)=='e' || str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u')
                sum++;
        }
        System.out.print(sum);
    }
}