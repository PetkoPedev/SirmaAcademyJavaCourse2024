import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private final List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        this.elements.add(element);
    }

    public T remove(int index){
        return this.elements.remove(index);
    }

    public boolean contains(T element){
        return this.elements.contains(element);
    }

    public void swap(int firstIndex, int secondIndex){
        T temp = this.elements.get(firstIndex);
        this.elements.set(firstIndex, this.elements.get(secondIndex));
        this.elements.set(secondIndex, temp);
    }

    public int countGreaterThan(T element){
        return (int) this.elements.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax(){
        return Collections.max(elements);
    }

    public T getMix(){
        return Collections.min(elements);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for(T element : this.elements){
            output.append(element).append(System.lineSeparator());
        }

        return output.toString();
    }
}
