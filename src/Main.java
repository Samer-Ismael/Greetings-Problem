import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int times = 0;

        for (int i = 1; i < input.length() - 1; i++){
            if (input.contains("e")){
                times = i;
            }
        }
        System.out.print("H");
        for (int i = 1; i <= times * 2; i++){
            System.out.print(("e"));
        }
        System.out.print("y");
    }
}