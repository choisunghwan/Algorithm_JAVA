package 브론즈3;

import java.util.Arrays;
import java.util.Scanner;

public class 최소최대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //입력 받음(정수의 개수)

        int[] arr = new int[n]; //배열 선언과 동시에 배열 크기(n) 할당
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();    
        }

        sc.close();

        Arrays.sort(arr); //✍Arrays.sort()메소드: 배열에 저장된 원소 값을 오름차순으로 정렬해주는 메소드.
        System.out.println(arr[0]+" "+arr[n -1]);
    }
    
}

/* 최솟값과 최댓값을 구하는 프로그램
입력
5
20 10 35 30 7


출력
7 35
 */