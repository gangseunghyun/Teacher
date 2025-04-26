package Day09;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

    static int fishRandomMake(int[][] hosu, Random r, int fishCount){
        for(int i = 0;i<3;i++){
            int fy = r.nextInt(5);
            int fx = r.nextInt(5);
            if(hosu[fy][fx] == 0){
                hosu[fy][fx] = 1;
                fishCount++;
            }
            else{
                i--;
            }
        }
        return fishCount;
    }

    static void noCastingPrint(int[][] hosu){
        for(int i = 0;i<hosu.length;i++){
            for(int j = 0;j<hosu[i].length;j++){
                if(hosu[i][j] == 0){
                    System.out.print("○");
                }
                else{
                    System.out.print("●");
                }
            }
            System.out.println();
        }
    }

    static void castingFisher(int[] yx,Scanner sc){
        while (true){
            System.out.print("행 입력 : ");
            yx[0] =sc.nextInt();
            System.out.print("열 입력 : ");
            yx[1] = sc.nextInt();
            if(yx[0] > -1 && yx[0] < 5 && yx[1] > -1 && yx[1] <5){
                break;
            }
        }
        System.out.println("y : "+yx[0]+", x : "+yx[1]);
    }

    static int checkFish(int[][] hosu,int y, int x, int fishCount){
        if(hosu[y][x] == 1){
            System.out.println("물고기를 잡았습니다.");
            hosu[y][x] = 0;
            fishCount--;
        }
        return fishCount;
    }

    static void castingPrint(int[][] hosu, int[]yx){
        for(int i = 0;i<hosu.length;i++){
            for(int j = 0;j<hosu[i].length;j++){
                if(i == yx[0] && j == yx[1]){
                    System.out.print("X");
                }
                else if(hosu[i][j] == 0){
                    System.out.print("○");
                }
                else{
                    System.out.print("●");
                }
            }
            System.out.println();
        }
    }

    static int fishMoveInput(Scanner sc){
        System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
        int num = sc.nextInt();
        return num;
    }

    static void fishMove(int[] yx,int num){
        if(num == 1){
            yx[0]--;
            if(yx[0] < 0){
                System.out.println("더이상 위로 움직일 수 없습니다.");
                yx[0] = 0;
            }
        }
        else if(num == 2){
            yx[0]++;
            if(yx[0] > 4){
                System.out.println("더이상 아래로 움직일 수 없습니다.");
                yx[0] = 4;
            }
        }
        else if(num == 3){
            yx[1]--;
            if(yx[1] < 0){
                System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                yx[1] = 0;
            }
        }
        else if(num == 4){
            yx[1]++;
            if(yx[1] > 4){
                System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                yx[1] = 4;
            }
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }
    }

    static void start(){
        //1.
        int[][] hosu = new int[5][5]; // 호수 초기화 0 -> 1바꿔서 물기 위치를 나타낸다
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] yx = new int[2];
        int fishCount = 0; // 물고기가 배치가 올바르게 되면 3이 되게 해서 게임시작
        //2. 호수에 물고기 배치
        fishCount=fishRandomMake(hosu,r,fishCount);
        //3. 물고기 배치된 호수 출력
        noCastingPrint(hosu);
        //4. 캐스팅
        castingFisher(yx,sc);
        //5.물고기 잡았는지 확인
        fishCount=checkFish(hosu,yx[0],yx[1],fishCount);
        //6. 출력
        castingPrint(hosu,yx);
        while (fishCount > 0) {
            //7. 위 아래 왼쪽 오른쪽 입력
            //8. 이동 확인
            fishMove(yx, fishMoveInput(sc));
            //9. 물고기 확인
            fishCount = checkFish(hosu, yx[0], yx[1], fishCount);
            //10.출력
            castingPrint(hosu, yx);
        }
        // 물고기 모두 잡았다.
        System.out.println("물고기를 모두 잡았습니다.");
    }

    public static void main(String[] args) {
        start();
    }
}
