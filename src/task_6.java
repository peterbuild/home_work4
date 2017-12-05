import java.util.Scanner;

public class task_6 {
    static void drawRectangle(int w, int h) {
        if (h > 0) {
            line(w);
            System.out.println();
            drawRectangle(w, h - 1);
        }
    }

    static void line(int x) {
        if (x > 0) {
            line(x - 1);
            System.out.print("+ ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x: ");
        int x = sc.nextInt();
        System.out.print("enter y: ");
        int y = sc.nextInt();
        drawRectangle(x, y);

    }
}

