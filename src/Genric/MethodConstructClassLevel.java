package Genric;

public class MethodConstructClassLevel<T> {

    private T value;

    public MethodConstructClassLevel(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        new MethodConstructClassLevel<>("");
        new MethodConstructClassLevel<>(2);
    }

    public <S>  T getGenric(S val){
        return value;
    }
}
