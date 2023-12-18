public class Potato extends Food
{
    private String type;

    public Potato(String type)
    {
        super("Potato");
        this.type = type;

    }
    public void consume() {
        System.out.println(this + " eaten");
    }

    public String getType() {
        return type;
    }

    public void setSize(String type) {
        this.type = type;
    }


   /* public boolean equals(Object arg0) {
        if (super.equals(arg0)) {

            return type.equals(((Potato)arg0).type);
        } else
            return false;
    }*/


    public String toString() {
        return super.toString() + " type '" + type.toUpperCase() + "'";
    }
}
