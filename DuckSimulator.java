// Main Class
public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        mallard.display();
        mallard.performFly();
        mallard.performSwim();

        System.out.println();

        rubber.display();
        rubber.performFly();
        rubber.performSwim();

        System.out.println();

        decoy.display();
        decoy.performFly();
        decoy.performSwim();
    }
}
