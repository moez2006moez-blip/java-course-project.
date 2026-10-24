
package java_project;

public class NumericBox<T extends Number> {
    private T value;

    public NumericBox(T value) {
        this.value = value;
    }
    public T getValue() {
    return value;
}

public double getDoubleValue() {
    return value.doubleValue();
}
}

