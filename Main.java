import java.util.Scanner;

public class Main {
    public static void put(String text) {
        System.out.println(text);
    }
    
    public static String get() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
    
    public static void main(String[] args) {
        put("Enter something: ");
        String input = get();
        put("You entered: " + input);
    }
}
