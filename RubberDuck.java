public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NotFly(), new Float());
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck.");
    }
}
