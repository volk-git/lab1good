public class MainApplication {
    @SuppressWarnings("unchecked")

    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        Food[] products = new Food[20];

        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");

            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
                products[0] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
                products[1] = new Apple(parts[1]);
            }
            if (parts[0].equals("Potato")){
                breakfast[itemsSoFar] = new Potato(parts[1]);
                products[2] = new Potato(parts[1]);
            }
            itemsSoFar++;
        }

        countFood(breakfast, products[0]);
        countFood(breakfast, products[1]);
        countFood(breakfast, products[2]);

        for (Food item: breakfast)
            if(item != null)
                item.consume();
            else
                break;
        System.out.println("Всего хорошего!");
    }


    public static void countFood(Food[] foods, Food food) {
        int count = 0;
        for (Food f : foods) {
            if (f != null && f.equals(food)) {
                count++;
            }

        }
        System.out.println("There are " + count + " products of type " + food.getClass().getSimpleName() + " in the breakfast");
    }
}