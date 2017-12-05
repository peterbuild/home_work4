import java.util.Scanner;

public class task_1 {

    public static void couter (int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x: ");
        int x = sc.nextInt();
        couter(x);
    }
}
