public class Mouse extends Animal{

    public Mouse(String name, String color, int age, int health) {
        super(name, color, age, health);
    }

    @Override
    public void print() {

        System.out.println(this.getName() +
                "\n Цвет: " + this.getColor() +
                "\n Возраст: " + this.getAge() +
                "\n Здоровье: " + this.getHealth());





    }
}
