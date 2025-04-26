package Day11;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int com = r.nextInt(31)+1;
        System.out.println(com);
        while(true){
            System.out.print("사용자 입력 : ");
            int user = sc.nextInt();

            if(user > com){
                System.out.println("다운");
            }
            else if(user == com){
                System.out.println("정답입니다.");
                break;
            }
            else{
                System.out.println("업");
            }
        }
    }
}
