import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> data;

    public Box(){
        this.data = new ArrayList<>();
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public void add(T data){
        this.data.add(data);
    }

    public void swap(int firstIndex, int secondIndex){
        T temp = this.data.get(firstIndex);
        this.data.set(firstIndex, this.data.get(secondIndex));
        this.data.set(secondIndex, temp);
    }

//    public String getGreaterElements(T value){
//        return String.valueOf(this.data.stream().filter(e -> e.compareTo(value) > 0).count());
//    }

    public Integer getGreaterElements(T value){
        return (int) this.data.stream().filter(e -> e.compareTo(value) > 0).count();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        this.data.forEach(e -> output.append(String.format("%s: %s%n", e.getClass().getName(), e)));
        return output.toString();
    }
}
