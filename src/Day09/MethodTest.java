package Day09;

public class MethodTest {
    static int abc(int a){
        if(a == 0){
            return 0;
        }
        else{
            return abc(a-1) + a;
        }
    }
    public static void main(String[] args) {
        int result = abc(100);
        System.out.println(result);
    }
}
