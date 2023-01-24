public class Cow extends Animal{
    private String name;
    private String color;

    public Cow(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
