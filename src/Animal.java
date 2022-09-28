public abstract class Animal implements Printable {

    private String name;
    private String color;
    private int age;
    private int health;

    public Animal(String name, String color, int age, int health) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
