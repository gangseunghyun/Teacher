package Day09;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    static void makeRandom(int[] com,Random r){
        for(int i =0;i<3;i++){
            com[i] = r.nextInt(9)+1; // 0 -> 7 1 -> 7
            for(int j =0;j<i;j++){
                if(com[i] == com[j]){ // com[1] == com[0]
                    i--; // 1 -> 0
                    break;
                }
            }
        }
    }
    static void comPrint(int[] com){
        for(int i = 0;i<3;i++){
            System.out.print(com[i]+" ");
        }
    }
    static void inputUser(int[] user, Scanner sc){
        //입력
        for(int i = 0;i<3;i++){
            System.out.print(i+1+"자리 : ");
            user[i] = sc.nextInt();
            //1. 1~9아닌경우 다시 입력
            if(user[i] < 1 || user[i] > 9){
                i--;
                continue;
            }
            //2. 중복이 있는 경우 다시 입력
            for(int j =0;j<i;j++){
                if(user[i] == user[j]){ // com[1] == com[0]
                    i--; // 1 -> 0
                    break;
                }
            }
        }
    }
    static int[] checkSB(int[] user,int[] com){
        int[] check = new int[2]; // 초기화 0
        for(int i = 0;i<3;i++){ //user
            for(int j = 0;j<3;j++){ //com
                if(user[i] == com[j]){
                    //strike ball
                    if(i == j){
                        check[0]++;
                    }
                    else{
                        check[1]++;
                    }
                }
            }
        }
        return check;
    }
    static boolean resultPrint(int[] check){
        if(check[0] == 0 && check[1] == 0){
            System.out.println("Out 입니다.");
            return true;
        }
        else if(check[0] == 3){
            System.out.println("홈런입니다. 축하합니다.");
            return false;
        }
        else{
            System.out.println("strike : "+check[0]+", ball : "+check[1]);
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r= new Random();
        int[] com = new int[3];
        makeRandom(com,r);
        comPrint(com);
        System.out.println();
        int[] user = new int[3];
        while(true){
            inputUser(user,sc);
            int[] check=checkSB(user,com);
            if(!resultPrint(check)){
                break;
            }
        }
        /*
        boolean check1 = true;
        while(check1){
                inputUser(user,sc);
                int[] check=checkSB(user,com);
                check1 =resultPrint(check);
            }
        }

         */
    }
}
