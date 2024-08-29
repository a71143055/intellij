//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("AICat");
        cat.setBreeds("Persian");
        cat.setWeight(3);

        System.out.print(cat.getName() + "이 ");
        cat.claw();

        System.out.print(cat.getName() + "이 ");
        cat.meow();

        System.out.println(cat.getName() + ", " + cat.getBreeds() + ", " + cat.getWeight());
    }
}