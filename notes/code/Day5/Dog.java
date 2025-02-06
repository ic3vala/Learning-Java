public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println(getName() + "在啃骨头！");
    }

    public void bark() {
        System.out.println(getName() + "汪汪叫！");
    }
}
