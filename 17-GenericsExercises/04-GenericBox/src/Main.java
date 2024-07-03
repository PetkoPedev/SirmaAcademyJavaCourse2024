import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Box<String> box = new Box<>();
//        Box<Integer> box = new Box<>();
        Box<Double> box = new Box<>();

        int n = Integer.parseInt(sc.nextLine());
        while (n > 0){
//            box.add(sc.nextLine());
//            box.add(Integer.parseInt(sc.nextLine()));
            box.add(Double.parseDouble(sc.nextLine()));
            n--;
        }


//        System.out.println(box.toString());

//        String input = sc.nextLine();
//        System.out.println(box.getGreaterElements(input));

        Double input = Double.parseDouble(sc.nextLine());
        System.out.println(box.getGreaterElements(input));
    }

}
