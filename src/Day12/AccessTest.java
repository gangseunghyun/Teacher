package Day12;

class X{ //default
    public int a; //pubilc
    private int b; // private

    public void abc(){

    }
    private void def(){

    }
    public int getB(){
        return b;
    }
    public void setB(int b){
        this.b = b;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        X x = new X();
        System.out.println(x.a);
        //System.out.println(x.b); private
        x.abc();
        //x.def(); private
        x.setB(5);
        System.out.println(x.getB());
    }
}
