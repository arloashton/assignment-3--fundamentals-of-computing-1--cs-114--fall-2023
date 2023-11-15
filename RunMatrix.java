import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Matrix matrix;

    System.out.println("What size should the matrix be?");
    int size = scan.nextInt();
    
    matrix = new Matrix(size);

    System.out.println("Matrix where all values are 0:");
    matrix.printMatrix();
    matrix.fillMatrix();
    System.out.println("Matrix filled with given values:");
    matrix.printMatrix();
    matrix.flip();
    System.out.println("Flipped Matrix:");
    matrix.printMatrix();

    scan.close();
  }
}
