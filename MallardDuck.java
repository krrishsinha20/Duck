public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new Fly(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck.");
    }
}
