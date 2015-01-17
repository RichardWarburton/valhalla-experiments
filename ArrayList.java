
public class ArrayList<any T> {

    private static final int EXTEND_QUANTITY = 10;
    private static final int INITIAL_SIZE = 10;

    private T[] values;
    private int position;

    public ArrayList() {
        values = new T[INITIAL_SIZE];
    }

    public void addd(T value) {
        ensureCapacity(position + 2);
        values[position++] = value;
    }

    private void ensureCapacity(int capacity) {
        if (values.length <= capacity)
            return;

        T[] newValues = new T[capacity + EXTEND_QUANTITY];
        // TODO: port Arrays.copy
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }

        values = newValues;
    }

    public T get(int index) {
        // TODO: maybe translate exception
        return values[index];
    }

    public int size() {
        return position;
    }

    public void set(T value, int index) {
        // TODO: should we resize?
        ensureCapacity(index + 2);
        values[index] = value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size();i++) {
            if (i > 0) {
                sb.append(",");
            }
            // avoids compiler NPE, TODO: report
            T value = values[i];
            sb.append(value.toString());
        }
        sb.append("]");
        return sb.toString();
    }

}


