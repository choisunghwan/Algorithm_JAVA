/*풀이: https://couchcoding.tistory.com/376 */
package Bronze3;

import java.util.Scanner;

public class 최댓값 {
    public static void main(String[] args) {

        //9개의 서로 다른 수가 주어진다. 
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt(),
            sc.nextInt(),sc.nextInt(),sc.nextInt(),
            sc.nextInt(),sc.nextInt(),sc.nextInt() };
        sc.close();
        
        int count = 0;
        int max = 0;
        int index =0;


        for(int value : arr){ //for(대입받을 변수: 배열명)
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
