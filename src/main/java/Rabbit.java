public class Rabbit extends Animal {
    private String eyeColor;

    public Rabbit(String eyeColor, String name, int age) {
        super(name, age);
        this.eyeColor = eyeColor;
    }

    @Override
    public void play() {
        System.out.println("Rabbit: " + name + " is being still");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Rabbit: " + name + " is ignoring the toy " + toy);
    }
}
