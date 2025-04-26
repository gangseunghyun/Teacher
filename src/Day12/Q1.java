package Day12;

import java.util.Random;
import java.util.Scanner;

/*
시민 또는 마피아 -> 마피아를 알 수 있는 데이터가 필요 / 마피아나 시민에 따라 출력하는 기능
경찰 물어보는거만 있으면 된다.
마피아가 누구인지는 외부에서 선택후에 알려준다
마피아를 찾을때까지 반복
 */
class Human{
    boolean check; // true면 마피아 false 시민
    void print(){
        if(check){
            System.out.println("네 제가 마피아입니다.");
        }
        else{
            System.out.println("억울합니다. 저는 마피아가 아닙니다.");
        }
    }
}
class Police{
    Scanner sc = new Scanner(System.in);
    int input(){
        System.out.print("마피아는?");
        return sc.nextInt();
    }
}

public class Q1 {
    public static void main(String[] args) {
        //마피아 선택을 위한 Random 객체 생성
        Random r = new Random();
        //사람 5명 경찰 1명
        Human[] hlist = new Human[5];
        Police p = new Police();
        //누가 마피아 인지 선택
        int num = r.nextInt(5); // 0~4
        for(int i = 0;i<hlist.length;i++){
            hlist[i] = new Human();
            if(num == i){
                hlist[i].check = true;
            }
            else{
                hlist[i].check = false;
            }
        }
        //실제 마피아 찾기 시작
        while (true){
            int pNum = p.input();
            if(pNum >0 && pNum<6){
                hlist[pNum-1].print();
                if(hlist[pNum-1].check){
                    break;
                }
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
