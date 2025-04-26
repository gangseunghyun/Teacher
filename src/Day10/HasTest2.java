package Day10;


class Subject{
    String SubjectName;
    int scorePoint;
}
class Student{
    int studentID;
    String studentName;
    Subject korean; // 참조 자료형 변수 선언 class -> 다른 class 변수를 선언을 하는 것을 has 관계
    Subject math;
}

public class HasTest2 {
}
