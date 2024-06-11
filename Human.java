public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {

        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        this.weight++;

        System.out.println(this.name + " weights " + this.weight + " kg ");
    }
}
