package Day11;

import java.util.Random;

/*
주사위 클래스
1.속성
 색깔 , 난수를 통한 1~6까지 값을 가지는 정수 변수
2.기능
  던지면 1~6에  수를 나오게 하는 기능
 */
class Dice{
    String color;
    int num;
    Random r = new Random();
    Dice(String color){
        this.color = color;
    }
    int throwDice(){
        num = r.nextInt(6)+1;
        return num;
    }
}
public class Q1 {
    public static void main(String[] args) {
        //1. 주사위 2개 객체 생성(빨간 , 파란)
        Dice red = new Dice("빨간");
        Dice blue = new Dice("파란");
        //2. 주사위 결과를 담을 변수, trun 변수
        int redResult = 0;
        int blueResult = 0;
        int turn = 1;

        while (redResult < 50 && blueResult <50){
            System.out.println("============"+(turn++)+"===============");
            redResult += red.throwDice();
            blueResult += blue.throwDice();

            System.out.println(red.color+"주사위 : "+redResult);
            System.out.println(blue.color+"주사위 : "+blueResult);
        }
        if(redResult > blueResult){
            System.out.println(red.color+"주사위 승리");
        }
        else if(redResult == blueResult){
            System.out.println("무승부");
        }
        else{
            System.out.println(blue.color+"주사위 승리");
        }
    }
}
