package Day09;

class Pencil{
    String color;
    void write(){
        System.out.println(color+"연필로 적습니다.");
    }
}
class Eraser{
    String made;
    void eraser(){
        System.out.println(made +"제품으로 지웁니다.");
    }
}
class Pen{
    String made;
    String color;
    void  write(){
        System.out.println("펜을 "+made+"의 "+color+"로 씁니다.");
    }
}
public class Q4 {
    public static void main(String[] args) {
        Pencil red = new Pencil();
        Pencil blue = new Pencil();
        Pencil orange = new Pencil();
        Pencil yellow = new Pencil();

        red.color = "빨강";
        blue.color = "파랑";
        orange.color = "주황";
        yellow.color = "노랑";

        red.write();
        blue.write();
        orange.write();
        yellow.write();

        Eraser e1 = new Eraser();
        Eraser e2 = new Eraser();

        e1.made = "잠자리";
        e2.made = "모닝글로리";

        e1.eraser();
        e2.eraser();

        Pen p1 = new Pen();
        Pen p2 = new Pen();
        Pen p3 = new Pen();

        p1.color = "검정색";
        p1.made = "모나미";
        p2.color = "초록색";
        p2.made = "제트스트림";
        p3.color = "베이비블루";
        p3.made = "워터맨";

        p1.write();
        p2.write();
        p3.write();
    }
}
