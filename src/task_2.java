import java.util.Scanner;

public class task_2 {
//task 1
    public static void drawRectengle(int w, int h) {
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print("+"); //рисуем ряд
            }
            System.out.println(); //новый ряд
        }
    }
//task 2
    public static void drawRectengle(int w) {
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("+"); //рисуем ряд
            }
            System.out.println(); //новый ряд
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter width :");
        int w = in.nextInt();
        System.out.println("Enter height :");
        int h = in.nextInt();
        drawRectengle(w, h);

        System.out.println();

        drawRectengle(w);
    }
}


