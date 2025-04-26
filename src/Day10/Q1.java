package Day10;

class Dog{
    String color;
    int weight;
    void bowl(){
        System.out.println(weight+"kg "+color+"의 개가 짖는다.");
    }
}
class Cat{
    String color;
    int weight;
    void yayong(){
        System.out.println(weight+"kg "+color+"의 고양이가 야옹한다.");
    }
}
class Bird{
    String color;
    int weight;
    void fly(){
        System.out.println(weight+"kg "+color+"의 새가 날아간다.");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.color = "노란색";
        d2.color = "빨간색";
        d1.weight = 3;
        d2.weight = 6;

        Cat c1 = new Cat();
        Cat c2 = new Cat();
        c1.color = "파랑색";
        c2.color = "주황색";
        c1.weight = 2;
        c2.weight = 3;

        Bird b = new Bird();
        b.color = "회색";
        b.weight = 1;

        d1.bowl();
        d2.bowl();

        c1.yayong();
        c2.yayong();

        b.fly();
    }
}
