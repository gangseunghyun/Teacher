package Day09;
class A{
    int a; // 변수(속성)
     void print(){//메소드(기능)
        System.out.println("a는 "+a+"입니다.");
    }
}
public class ClassTest1 {
    public static void main(String[] args) {
        A a = new A(); // 객체 생성
        a.a = 20;
        a.print();

        A b = new A();
        b.print();
    }
}
