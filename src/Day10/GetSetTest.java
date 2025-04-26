package Day10;
class GETSET{
    int a;
    String str;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
}
class Robot{
    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}


public class GetSetTest {
    public static void main(String[] args) {
        GETSET gs = new GETSET();
        gs.setA(10);
        gs.setStr("hello");
        System.out.println(gs.getA());
        System.out.println(gs.getStr());
    }
}
