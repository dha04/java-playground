public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("CAT " + name + " jumps on the table");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("CAT " + name + " is playing the toy " + toy);
    }
}
