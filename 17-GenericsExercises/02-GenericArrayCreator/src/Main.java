import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer[] arr = ArrayCreator.create(Integer.class, 2, 2);
        Arrays.stream(arr).forEach(System.out::println);
    }
}