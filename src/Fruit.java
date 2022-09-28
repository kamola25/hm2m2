public abstract class Fruit implements Printable {

    private String name;
    private String color;
    private Taste taste;

    public Fruit(String name, String color, Taste taste) {
        this.name = name;
        this.color = color;
        this.taste = taste;
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

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }
}