package Day10;
class Car{
    String color;
    String manu;
    int maxSpeed;
    Car(String c, String m, int max){
        color = c;
        manu = m;
        maxSpeed = max;
    }

    void drive(){
        System.out.println(manu+"의 "+color+"색깔 자동차를 "+maxSpeed+"로 운전합니다.");

    }
}
class Bike{
    String manu;
    String function;
    Bike(String m, String f){
        manu = m;
        function = f;
    }
    void ride(){
        System.out.println(manu+"의 자전거의 기능인"+function+"을 사용해서 자전거를 탑니다.");
    }
}
class Moto{
    String color;
    String manu;
    int maxSpeed;
    Moto(String c, String m, int max){
        color = c;
        manu = m;
        maxSpeed = max;
    }
    void drive(){
        System.out.println(manu+"의 "+color+"색깔 오토바이를 "+maxSpeed+"로 운전합니다.");
    }
}
class Human1{
    Car c1;
    Car c2;
    Human1(Car car1, Car car2){
        c1 = car1;
        c2 = car2;
    }
    void hDrive(){
        System.out.print("사람 1이 ");
        c1.drive();
        System.out.print("사람 1이 ");
        c2.drive();
    }
}
class Human2{
    Bike b;
    Moto m;
    Human2(Bike bike, Moto moto){
        b = bike;
        m = moto;
    }
    void hDrive(){
        System.out.print("사람 2이 ");
        b.ride();
        System.out.print("사람 2이 ");
        m.drive();
    }
}

public class Q2 {
    public static void main(String[] args) {
        Car c1 = new Car("은","Ford",220);
        Car c2 = new Car("검정","BMW",240);
        Car c3 = new Car("하얀","삼성",200);
        Car c4 = new Car("형광","현대",180);

        Bike b1 = new Bike("삼천리","산악용");
        Bike b2 = new Bike("자이언트","접이식용");

        Moto m = new Moto("빨간","대림",180);

        c1.drive();
        c2.drive();
        c3.drive();
        c4.drive();

        b1.ride();
        b2.ride();

        m.drive();

        Human1 h1 = new Human1(c2,c4);
        Human2 h2 = new Human2(b1,m);

        c2 = null;
        c4 = null;

        b1 = null;
        m = null;

        h1.hDrive();
        h2.hDrive();
    }

}
