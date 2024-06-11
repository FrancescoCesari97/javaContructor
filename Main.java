public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("freedus", 26, 80);

        Human human2 = new Human("drew", 28, 75);

        System.out.println(human2.name);

        human2.eat();

    }
}