package Day11;


import java.util.Scanner;

public class Q4_1 {
    static String input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        return sc.next();
    }
    static String makeResult(String str){
        char ch = str.charAt(0);
        int count = 0;
        String result = "";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ch){
                count++;
            }
            else{
                result += makeChar(ch,count);
                ch = str.charAt(i);
                count = 1;
            }
        }
        //마지막값 한번 더 돌려줘야한다.
        result += makeChar(ch,count);
        return result;
    }

    static char makeChar(char ch,int count){
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
        if(ch == '9'){
            return key[8][0];
        }
        else if(ch == '*'){
            return key[9][0];
        }
        else if(ch == '0'){
            return key[10][0];
        }
        else if(ch == '#'){
            return key[11][0];
        }
        else{
            count = (count - 1) % 3;
            return key[(ch -'0')-1][count];
        }
    }

    static void printString(String result){
        System.out.println(result);
    }
    public static void main(String[] args) {
//        String str = input();
//        String result = makeResult(str);
//        printString(result);
          printString(makeResult(input()));
    }
}
