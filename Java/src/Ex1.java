import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        int counter = 0;
        System.out.println("enter new string: ");
        str = in.nextLine();
        while (str.length() > 4) {
            if (str.contains("T")) {
                counter++;
            }
            System.out.println("enter new string: ");
            str = in.nextLine();
        }

        System.out.printf("T appears %d times.", counter);
        in.close();
    }
}
