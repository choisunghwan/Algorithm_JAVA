package Bronze4;

import java.util.Scanner;

/**
 * 모음의개수
 */
public class 모음의개수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        // String str ="";
        while(true){
            String str = sc.nextLine().toLowerCase(); //📌1. nextLine 와 next 차이점? , toLowerCase?
            if(str.equals("#")){
                break;
            }
            // 문장 쪼개서 배열에 넣어주기
            String arr[] = str.split("");

            System.out.println("arr값 로그 찍기 == "+arr[0]+arr[1]);
            
            for(int i = 0; i<arr.length; i++){
                if(arr[i].equals("a") || arr[i].equals("e")|| arr[i].equals("o")|| arr[i].equals("i")|| arr[i].equals("u")){
                    cnt++;
                }
            }
            System.out.println(cnt);
            cnt=0; //문장바뀌면 0으로 초기화해주기
        }
    }
}

/*
 * 1. next() 메서드는 string 자료형 이며, 스페이스 or 줄바꿈 문자<enter>구분함.
 *  반면 nextLine()메서드는 string 자로형이지만, 문자열1줄 단위로 입력을 받음.
 * 
 * toLowerCase:소문자로 변환하기 (즉, 대소문자 구분 없이 모두 소문자가 됨.)
 * 
 * 
 * 2.charAt()메서드 : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 
 * 변환해주는 녀석
 */

/* 처음으로 짰던 코드
  *     public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //📌1. nextLine 와 next 차이점?
        
        for (int i = 0; i<str.length(); i++){  //📌charAt()메서드?
            if(str.charAt(i) == 'a' || str.charAt(i)=='e' || str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u')
                sum++;
            else if(str.equals("#")){
                break;
            }
        }
        System.out.print(sum);
    }
}

  */


/* INPUT 예제 👇 
How are you today?
Quite well, thank you, how about yourself?
I live at number twenty four.
#
*/