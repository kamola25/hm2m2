public class Banana extends  Fruit{


    public Banana(String name, String color, Taste taste) {
        super(name, color, taste);
    }

    @Override
    public void print() {
        System.out.println(this.getName() +
                "\nЦвет: " + this.getColor() +
                "\nВкус: " + this.getTaste());


    }
}
