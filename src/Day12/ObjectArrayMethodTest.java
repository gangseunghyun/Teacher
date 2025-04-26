package Day12;

class D{ }
public class ObjectArrayMethodTest {

    static D[] sendD(D[][] d ,int i , int j){
        d[i][j] = new D();
        return d[i];
    }

    public static void main(String[] args) {
        D[][] d1 = new D[3][3];
        D[] d2 = sendD(d1, 0,2);
        //문제
        //1. d2는 배열 객체가 있을까요? O
        //2. d1는 D객체가 존재 할까요?  O
        //3. d1[0] == d2 O
        //4. d1에 객체가 있다면 정확한 위치는 어디일까요? d1[0][2]
        //5. d2에 객체가 있다면 정확한 위치는 어디일까요? d2[2]
    }
}
