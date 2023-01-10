package Bronze3;

import java.util.Scanner;

public class 최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt(),
            sc.nextInt(),sc.nextInt(),sc.nextInt(),
            sc.nextInt(),sc.nextInt(),sc.nextInt() };
        sc.close();
        
        int count = 0;
        int max = 0;
        int index =0;

        for(int value : arr){
            count++;

            if(value>max){
                max = value;
                index = count;
            }
        }

        //출력
        System.out.print(max + "\n" + index);

    }
}
