public class Duck extends Animal implements Flying {


    @Override
    public void fly() {
        System.out.println("Я лечу");
    }

    @Override
    public void Say() {
        System.out.println("Кря");
    }
}
