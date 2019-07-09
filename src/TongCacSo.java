import java.util.Scanner;

public class TongCacSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double matrix[][] = new double[3][3];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = Math.floor(Math.random() * 15);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("Nhap vao cot muon tinh tong");
        int row = sc.nextInt();

        double Tog = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                Tog += matrix[column][row];

        }
        System.out.println("Tong la :" +Tog);
    }
}