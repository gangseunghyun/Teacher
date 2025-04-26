package Day10;

class A{
    int a; // 멤버변수
    void print(int a/*매개변수 인자*/){
        int b;//메소드 변수 지역변수
    }
    A(){ //생성자
        a = 10;
    }
}
public class ClassTest1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);//??
    }
}
