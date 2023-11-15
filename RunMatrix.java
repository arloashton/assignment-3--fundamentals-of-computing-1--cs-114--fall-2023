import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Matrix matrix;
    //REQUESTS USER SIZE (STEP 1)//
    System.out.println("What size should the matrix be?");
    int size = scan.nextInt();

    matrix = new Matrix(size);
    //0 MATRIX (STEP 2)//
    System.out.println("Matrix where all values are 0:");
    matrix.printMatrix();
    //FILLED MATRIX (STEP 4)//
    matrix.fillMatrix();
    System.out.println("Matrix filled with given values:");
    matrix.printMatrix();
    //FLIPPED MATRIX (STEP 6)//
    matrix.flip();
    System.out.println("Flipped Matrix:");
    matrix.printMatrix();

    scan.close();
  }
}
