public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco", 14);
        Dog max = new Dog("max", 5, "Peng");
        Rabbit snowWhite = new Rabbit("red", "snow ball", 4);
        Toy curious = new Toy("abc corp");
        Toy legoCar = new Toy("Lego Truck");
        Action[] homeFriends = new Action[4];
        homeFriends[0] = coco;
        homeFriends[1] = max;
        homeFriends[2] = snowWhite;
        homeFriends[3] = curious;

        curious.play();

        for(Action friends : homeFriends) {
            friends.play(legoCar);
        }
    }
}
