import java.util.Arrays;

public class DynamicArray<T> {
    private Object[] array;
    private int size;
    private static final int INITIAL_SIZE = 10;
    private static final int GROW_SIZE = 10;

    public DynamicArray() {
        array = new Object[INITIAL_SIZE];
        size = 0;
    }

    public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }

    public int size() {
        return size;
    }

    public void remove() {
        if (size > 0) {
            size--;
            shrinkIfNeeded();
        }
    }

    public void remove(int index) {
        checkIndex(index);
        if (size > 0) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            size--;
            shrinkIfNeeded();
        }
    }

    public void set(int index, int element) {
        checkIndex(index);
        array[index] = element;
    }

    public void clear() {
        size = 0;
        shrinkIfNeeded();
    }

    private void ensureCapacity() {
        if (size == array.length) {
            grow();
        }
    }

    private void grow() {
        int newSize = array.length + GROW_SIZE;
        array = Arrays.copyOf(array, newSize);
    }

    private void shrinkIfNeeded() {
        if (canShrink()) {
            shrink();
        }
    }

    private boolean canShrink() {
        return (array.length - size) >= GROW_SIZE && (array.length - GROW_SIZE) >= INITIAL_SIZE;
    }

    private void shrink() {
        int newSize = array.length - GROW_SIZE;
        array = Arrays.copyOf(array, newSize);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    }

}
