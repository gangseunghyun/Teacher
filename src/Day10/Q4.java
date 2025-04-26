package Day10;

class Animal{
    String type; // 동물 종류
    String food; //음식 종류
    Animal(String type, String food){ //내가 생성자에 입력할 동물종류,음식종류
        this.type = type;
        this.food = food;
    }

    void print(){
        System.out.println(type+"는 먹이로 "+food+"를 들고 있습니다.");
    }

    public String getType() {
        return this.type;
    }
    public void setType(String type) {

        this.type = type;
    }
    public String getFood() {
        return this.food;
    }
    public void setFood(String food) {

        this.food = food;
    }
}

public class Q4 {
    public static void main(String[] args) {
        String[] at = {"원숭이","개","닭","돼지"};
        String[] ft = {"바나나","뼈다귀","모이","여물"};

        Animal[] animals = new Animal[4];

        for(int i = 0;i< animals.length;i++){
            animals[i] = new Animal(at[i],ft[i]);
            animals[i].print();
        }

        //먹이교환
        String temp = animals[3].getFood();
        for(int i = 3;i>0;i--){
            animals[i].setFood(animals[i-1].getFood());  //객체이름.set멤버변수이름(넣고자하는 값)
        }                                                //객체이름.get+멤버변수이름()
        animals[0].setFood(temp);


        //출력
        System.out.println("============먹이 교환 후 ==================");
        for(int i = 0;i<animals.length;i++){
            animals[i].print();
        }
    }
}
