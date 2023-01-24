public class Wolf extends Animal {
    private String name;
    private String color;

    public Wolf(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
