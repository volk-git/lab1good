public class Apple extends Food {
    private String size;

    public Apple(String size) {
        super("Apple");
        this.size = size;
    }

    public void consume() {
        System.out.print(String.valueOf(this) + " съедено ");
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " размера '" + this.size.toUpperCase() + "'";
    }
}
