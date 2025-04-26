package Day12;

import java.util.Random;
import java.util.Scanner;

//메소드 오버로딩
class A{
    A(){
        System.out.println("없습니다.");
    }
    A(int a){
        System.out.println(a);
    }
    A(int a, int b){
        System.out.println(a+"," + b);
    }
    int add(int a, int b){
        return  a + b;
    }
    double add(double a, double b){
        return a + b;
    }
    int add(int a){
        return a + 5;
    }
}
public class OverloadingTest {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(5,3));
        System.out.println(a.add(1.7,1.8));
        System.out.println(a.add(10));
        A a1 = new A(5);
        A a2 = new A(3,7);

    }
}
