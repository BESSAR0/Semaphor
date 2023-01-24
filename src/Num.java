public class Num <T> extends Animal{
    public T name, color;

    Num(T name, T color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Num{" +
                "name=" + name +
                ", color=" + color +
                '}';
    }
}
