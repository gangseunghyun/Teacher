package Day12;

import java.util.Random;
import java.util.Scanner;

//낚시게임
//물고기 호수 낚시꾼
//물고기 필요한거 : 필요한게 없어요.
class Fish{}
//호수 필요한거 : 물고기 5X5배열, 물고기 배치, 출력, 물고기를 주는 역활 -> 낚시꾼
class Hosu{
    Fish[][] fList = new Fish[5][5];
    Hosu(){
        Random r = new Random();
        for(int i= 0;i<3;i++){
            int y = r.nextInt(5);
            int x = r.nextInt(5);
            if(fList[y][x] != null){
                i--;
            }
            else{
                fList[y][x] = new Fish();
            }
        }
    }
    void printHosu(int[] postion,boolean check){
        for(int i = 0;i<fList.length;i++){
            for(int j =0;j<fList.length;j++){
                if(check&&postion[0] == i && postion[1] == j){
                    System.out.print("X");
                }
                else if(fList[i][j] == null){
                    System.out.print("○");
                }
                else{
                    System.out.print("●");
                }
            }
            System.out.println();
        }
    }
    
    Fish giveFish(int[] position){
        return fList[position[0]][position[1]];
    }
    void nullChange(int[] position){
        fList[position[0]][position[1]] = null;
    }
}
//낚시꾼 필요한거 : 본인 찌좌표, 이동에 전반적 기능, 물고기를받는 기능 종료를 알려주는 역할
class Fisher{
    int[] postion = new int[2];
    Fish[] bowl = new Fish[3];
    Scanner sc = new Scanner(System.in);
    Fisher(){
        while (true){
            System.out.print("행 입력 : ");
            postion[0] = sc.nextInt();
            System.out.print("열 입력 : ");
            postion[1] = sc.nextInt();
            if(postion[0] >-1 && postion[0] < 5 
                && postion[1] > -1 && postion[1] < 5)
            {
                break;
            }
        }
    }
    void reciveFish(Fish f){
        if(f != null){
            System.out.println("물고기 잡았습니다.");
        }
        for(int i = 0;i< bowl.length;i++){
            if(bowl[i] == null){
                bowl[i] = f;
                break;
            }
        }
    }
    void fishMove(){
        System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
        int num = sc.nextInt();
        //8. 이동 확인
        if(num == 1){
            postion[0]--;
            if(postion[0] < 0){
                System.out.println("더이상 위로 움직일 수 없습니다.");
                postion[0] = 0;
            }
        }
        else if(num == 2){
            postion[0]++;
            if(postion[0] > 4){
                System.out.println("더이상 아래로 움직일 수 없습니다.");
                postion[0] = 4;
            }
        }
        else if(num == 3){
            postion[1]--;
            if(postion[1] < 0){
                System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                postion[1] = 0;
            }
        }
        else if(num == 4){
            postion[1]++;
            if(postion[1] > 4){
                System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                postion[1] = 4;
            }
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }

    }

    boolean finshCheck(){
        for(int i = 0;i< bowl.length;i++){
            if(bowl[i] == null){
                return true;
            }
        }
        return false;
    }

}
public class Q2 {
    public static void main(String[] args) {
        Hosu h = new Hosu();
        h.printHosu(null,false);
        Fisher fisher = new Fisher();
        h.printHosu(fisher.postion,true);
        fisher.reciveFish(h.giveFish(fisher.postion));
        h.nullChange(fisher.postion);
        while (fisher.finshCheck()){
            fisher.fishMove();
            fisher.reciveFish(h.giveFish(fisher.postion));
            h.nullChange(fisher.postion);
            h.printHosu(fisher.postion,true);
        }
        System.out.println("물고기를 모두 잡았습니다.");
    }
}
