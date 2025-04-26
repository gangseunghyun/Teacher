package Day11;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();
        //2. 분석
        //1122335*#66
        char[][] key ={
                {'A','B','C'}, // 1 -> 0
                {'D','E','F'}, // 2 -> 1
                {'G','H','I'}, // 3 -> 2
                {'J','K','L'}, // 4 -> 3
                {'M','N','O'}, // 5 -> 4
                {'P','Q','R'}, // 6 -> 5
                {'S','T','U'}, // 7 -> 6
                {'V','W','X'}, // 8 -> 7
                {'Y'}, // 9 -> 8
                {'*'}, // -> 9
                {'Z'}, // 0 -> 10
                {'#'} // -> 11
        };


        char ch = str.charAt(0);
        int count = 0;
        String result = "";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ch){
                count++;
            }
            else{
                System.out.println(count);
                //바꾸는 작업
                if(ch == '9'){
                    result += key[8][0];
                }
                else if(ch == '*'){
                    result += key[9][0];
                }
                else if(ch == '0'){
                    result += key[10][0];
                }
                else if(ch == '#'){
                    result += key[11][0];
                }
                else{
                    count = (count - 1) % 3;
                    System.out.println((ch-'0')-1+"aa");
                    System.out.println(count+"bb");
                    result += key[(ch -'0')-1][count];
                }
                ch = str.charAt(i);
                count = 1;
            }
        }
        //마지막값 한번 더 돌려줘야한다.
        if(ch == '9'){
            result += key[8][0];
        }
        else if(ch == '*'){
            result += key[9][0];
        }
        else if(ch == '0'){
            result += key[10][0];
        }
        else if(ch == '#'){
            result += key[11][0];
        }
        else{
            count = (count - 1) % 3;
            result += key[(ch-'0')-1][count];
        }

        //3. 출력
        System.out.println(result);
    }
}
