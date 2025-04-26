package Day10;

class C{
    int x;
    int k;
    C(int a, int b){
        x = a;
        k = b;
    }
}
public class ClassTest2 {
    public static void main(String[] args) {
        //C c2 = new C();
        C c = new C(5,3);
        C c1 = new C(6,7);
        System.out.println(c.x+","+c.k);
        System.out.println(c1.x+","+c1.k);
    }
}
