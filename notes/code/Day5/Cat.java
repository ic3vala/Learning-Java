public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println(getName() + "在吃鱼！");
    }

    public void meow() {
        System.out.println(getName() + "喵喵叫！");
    }
}
