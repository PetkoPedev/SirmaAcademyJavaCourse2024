import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {
    public static<T> T[] create(int length, T item){
        T[] arr = (T[]) Array.newInstance(item.getClass(), length);
        Arrays.fill(arr, item);
        return arr;
    }

    public static<T> T[] create(Class<T> cls, int length, T item){
        T[] arr = (T[]) Array.newInstance(cls, length);
        Arrays.fill(arr, item);
        return arr;
    }
}
