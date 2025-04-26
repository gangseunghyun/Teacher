package Day10;

public class Q4_1 {
    public static void main(String[] args) {
        String[] at = {"원숭이","개","닭","돼지"};
        String[] ft = {"바나나","뼈다귀","모이","여물"};

        Animal[] animals = new Animal[4];

        for(int i = 0;i< animals.length;i++){
            animals[i] = new Animal(at[i],ft[i]);
//            animals[i] = new Animal();
//            animals[i].setType(at[i]);
//            animals[i].setFood(ft[i]);
            animals[i].print();
        }

        //먹이교환
        String temp = animals[3].getFood();
        for(int i = 3;i>0;i--){
            animals[i].setFood(animals[i-1].getFood());
        }
        animals[0].setFood(temp);

        //출력
        System.out.println("============먹이 교환 후 ==================");
        for(int i = 0;i<animals.length;i++){
            animals[i].print();
        }
    }
}
