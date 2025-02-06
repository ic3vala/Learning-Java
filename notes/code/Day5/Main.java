public class Main {
    public static void main(String[] args) {
        // 创建Dog对象
        Dog myDog = new Dog();
        myDog.setName("旺财");
        myDog.setAge(3);

        // 创建Cat对象
        Cat myCat = new Cat();
        myCat.setName("小白");
        myCat.setAge(2);

        // 演示多态：Animal引用指向子类对象
        Animal[] pets = new Animal[2];
        pets[0] = myDog;
        pets[1] = myCat;

        for (Animal pet : pets) {
            pet.eat(); // 调用重写后的方法
        }

        // 调用子类特有方法（需向下转型）
        if (pets[0] instanceof Dog) {
            ((Dog) pets[0]).bark();
        }
    }
}
