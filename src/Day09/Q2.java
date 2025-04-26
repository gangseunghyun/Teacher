package Day09;

import java.util.Scanner;

public class Q2 {
    static int[] inputUser(int count, Scanner sc){
        int[] hy = new int[2];
        System.out.println("예약하실 좌석을 입력해주세요.("+count+"석) : ");
        System.out.print("행 : ");
        hy[0] = sc.nextInt();
        System.out.print("열 : ");
        hy[1] = sc.nextInt();
        return hy;
    }
    static boolean wrongCheck(int[] hy){
        if(hy[0] > 9 || hy[0] < 1 || hy[1] > 2 || hy[1] < 1){
            System.out.println("잘못된 입력 입니다.");
            return true;
        }
        return false;
    }
    static int reserveCheck(boolean[][] seat,int[] hy, int count){
        if(seat[hy[0]-1][hy[1]-1]){
            emptyPrint(seat);
        }
        //2. 예약이 되어 있지 않아서 예약을 할 수 있는 경우
        else{
            count=reserve(seat,hy,count);
        }
        return count;
    }
    static void emptyPrint(boolean[][] seat){
        System.out.println("비어있는 좌석");
        for(int i = 0;i<seat.length;i++){
            for(int j = 0;j<seat[i].length;j++){
                if(!seat[i][j]){
                    System.out.println("행 : "+(i+1)+"열 : "+(j+1));
                }
            }
        }
    }
    static int reserve(boolean[][] seat,int[] hy,int count){
        System.out.println("예약이 완료됐습니다.");
        seat[hy[0]-1][hy[1]-1] = true;
        count--;
        return count;
    }

    public static void main(String[] args) {
        //1. 입력 객체 생성
        Scanner sc = new Scanner(System.in);
        //2. 비행기 좌석 배열 생성
        boolean[][] seat = new boolean[9][2]; //초기값 false
        //3. 예약 가능한 좌석 변수
        int count = 18;
        //반복 -> 예약이 끝날때까지 count 0 될 때 까지
        while(count > 0){
            int[]hy =  inputUser(count, sc);
            if(wrongCheck(hy)){
                continue;
            }
            count=reserveCheck(seat,hy,count);
        }
        System.out.println("모든 자리가 예약 됐습니다."); //@.@
    }
}
