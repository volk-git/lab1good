public class Cheese extends Food {
    public Cheese() {
        super("Cheese");
    }

    public void consume() {
        System.out.print(String.valueOf(this) + " съеден  ");
    }
}
