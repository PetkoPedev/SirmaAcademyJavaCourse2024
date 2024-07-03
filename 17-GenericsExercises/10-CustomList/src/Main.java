import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();

        String command = sc.nextLine();

        while (!command.equals("end")){
            String[] commandArgs = command.split("\\s+");

            switch (commandArgs[0]) {
                case "Add" -> {
                    String element = commandArgs[1];
                    customList.add(element);
                }
                case "Remove" -> {
                    int index = Integer.parseInt(commandArgs[1]);
                    customList.remove(index);
                }
                case "Contains" -> {
                    String searchedElement = commandArgs[1];
                    System.out.println(customList.contains(searchedElement));
                }
                case "Swap" -> {
                    int index1 = Integer.parseInt(commandArgs[1]);
                    int index2 = Integer.parseInt(commandArgs[2]);
                    customList.swap(index1, index2);
                }
                case "Greater" -> {
                    String greatElement = commandArgs[1];
                    System.out.println(customList.countGreaterThan(greatElement));
                }
                case "Max" -> System.out.println(customList.getMax());
                case "Min" -> System.out.println(customList.getMix());
                case "Print" -> System.out.println(customList.toString());
                default -> {
                }
            }

            command = sc.nextLine();
        }
    }
}
