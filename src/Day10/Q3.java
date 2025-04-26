package Day10;
/*
선수가 존재 -> 4명 한국, 중국, 미국, 러시아
선수가 달린다 -> 선수가 1~10까지 랜덤값을 가지고 이동이 되야합니다.
돌발상황 -> 외부에서 들어온 선수 X main 전달 선수한테 가야 한다.
 */

import java.util.Random;

class Player{
    int line; //레인번호
    String country; //나라명
    int go; // 이동거리

    Player(int line, String country){
        this.line = line;
        this.country = country;
    }
    void unExpected(int num){
        Random r = new Random();
        if(line == num){
            System.out.println("돌발상황 발생! : "+this.country);
        }
        else{
            go += r.nextInt(10)+1;
        }
    }

}

public class Q3 {
    public static void main(String[] args) {
        String [] contry = {"한국","중국","미국","러시아"};
        Player [] players = new Player[4];
        for(int i=0; i<4; i++){
            Player player = new Player(i+1,contry[i]);
            players[i] = player;
        }
        for(int i=0; i<4; i++){
            if(players[i].country.equals("중국")){
                System.out.println("중국은 몇번째? :"+i);
            }
        }


        Player korea = new Player(1,"한국");
        Player china = new Player(2,"중국");
        Player usa = new Player(3,"미국");
        Player russia = new Player(4,"러시아");
        int turn = 1;
        Random r = new Random();
        while(true){
            int ran = r.nextInt(4)+1; //1~4
            korea.unExpected(ran);
            china.unExpected(ran);
            usa.unExpected(ran);
            russia.unExpected(ran);
            System.out.println("=========="+(turn++)+"턴==================");
            System.out.println(korea.country+"는 "+korea.go+"M 입니다.");
            System.out.println(china.country+"는 "+china.go+"M 입니다.");
            System.out.println(usa.country+"는 "+usa.go+"M 입니다.");
            System.out.println(russia.country+"는 "+russia.go+"M 입니다.");

            if(korea.go > 99 || china.go > 99 || usa.go > 99 || russia.go >99){
                break;
            }
        }
        if(korea.go > china.go && korea.go > usa.go && korea.go > russia.go){
            System.out.println("우승은 한국입니다.");
        }
        else if(china.go > korea.go && china.go >usa.go && china.go >russia.go){
            System.out.println("우승은 중국입니다.");
        }
        else if(usa.go > korea.go && usa.go > china.go && usa.go > russia.go){
            System.out.println("우승은 미국입니다.");
        }
        else if(russia.go > korea.go && russia.go > china.go && russia.go > usa.go){
            System.out.println("우승은 러시아입니다.");
        }
        else{
            System.out.println("두나라가 동률이라 무승부 입니다.");
        }
    }
}
