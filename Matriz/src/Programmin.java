import java.util.Locale;
import java.util.Scanner;

public class Programmin {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of lines");
		int lin = sc.nextInt();
		
		System.out.println("Enter the number of columns");
		int col = sc.nextInt();
		int[][] matriz = new int[lin][col];
		
		for (int i = 0; i < lin; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("enter a number");
				matriz[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();
		Matriz matriz1 = new Matriz(matriz);
		for (int nlin = 0; nlin < lin; nlin++) {
			for (int ncol = 0; ncol < col; ncol++) {
				if (x == matriz1.getMatriz(nlin, ncol)) {
					System.out.printf("Position %d,%d:\n", ncol, nlin);
					
					matriz1.left(nlin, ncol);
					matriz1.right(nlin, ncol);
					matriz1.down(nlin, ncol);
					matriz1.up(nlin, ncol);
					
					System.out.println();

				}
			}
		}
	}
}
