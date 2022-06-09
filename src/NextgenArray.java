public class NextgenArray<T> {

    T[] elements;

    public NextgenArray(T[] elements) {
        this.elements = elements;
    }

    public T get(int index) {
        return this.elements[index - 1];
    }

    public void set(int index, T element) {
        this.elements[index - 1] = element;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i <= this.elements.length - 1; i++) {
            result += this.elements[i];
            if (i != this.elements.length - 1) {
                result += ",";
            }
        }

        return result;
    }
}
