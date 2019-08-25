import java.util.Scanner;

public class TreeHW {
    public static void main(String[] args) {
// Hello here is Hasan has try to check your repositery and says Hi!000000
        Scanner scanner = new Scanner(System.in);
        System.out.print("How tall should your tree be?>>");
        int height = scanner.nextInt();

        int row, column;
        for (row = 1; row <= height; row++) {
            for (column = 1; column <= row; column++) {
                if (row == 1) {

                    System.out.print("I");
                } else if (row == height){
                    System.out.print("M");
                    break;
                }
                else if (column % 2 != 0) {
                    System.out.print("x");
                } else if (column % 2 == 0){
                    System.out.print("y");
                }
            }
            System.out.println("");
        }

    }
}
