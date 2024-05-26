package generic.test.ex1;

public class Container<T> {

    private T item;

    public boolean isEmpty() {
    return item == null;
    }

    public void setItem(T data1) {
    this.item = data1;
    }

    public T getItem() {
    return item;
    }
}
