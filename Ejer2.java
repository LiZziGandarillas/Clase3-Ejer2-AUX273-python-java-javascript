import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		int x[] = new int[4];
		Scanner leer = new Scanner(System.in);
		String sc []=leer.nextLine().split(" ");
		for (int i = 0; i < sc.length; i++) {
			x[i]=Integer.parseInt(sc[i]);
		}
		Arrays.sort(x);
		System.out.println(x[2]);

	}

}
