public class Main {
    private static Object Fruit;

    public static void main(String[] args) {

        /*Banana banana = new Banana(" Banana ", " Yellow ",Taste.NICE);
        Apple apple = new Apple(" Apple "," Red ",Taste.SWEET);
        Orange orange = new Orange(" Orange "," Orange ",Taste.SOUR);

        Mouse mouse = new Mouse(" Mouse "," Gray ", 1,50);
        Horse horse = new Horse(" Horse "," Black ",15,70);
        Chicken chicken = new Chicken(" Chicken ", " Brown ",5,40);

        Printable [] printables = {banana,apple,orange,mouse,horse,chicken};

         */
        Fruit Banana = createObject("Banana");
        System.out.println(Banana);
        Banana.print();

        System.out.println();
        Fruit Apple = createObject("Apple");
        System.out.println(Apple);
        Apple.print();

        System.out.println();
        Fruit Orange = createObject("Orange");
        System.out.println(Orange);
        Orange.print();


    }
    public static Fruit createObject(String name) {
        switch (name) {
            case "Banana":
                return new Banana("Banana", "Yellow", Taste.NICE);
            case "Apple":
                return new Apple("Apple", "Red", Taste.SWEET);
            default:
                return new Orange("Orange","Orange",Taste.SOUR);
        }

    }




}