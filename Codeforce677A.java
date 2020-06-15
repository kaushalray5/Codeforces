import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
  {
		Scanner scan = new Scanner(System.in);
		int arrsize = scan.nextInt();
		int height = scan.nextInt();
		int[] arr = new int[arrsize];
		int sum = 0;
		for(int i=0; i<arrsize; i++) {
			arr[i] = scan.nextInt();
			sum += (arr[i] <= height) ? 1 : 2 ;
		}
		System.out.println(sum);
		scan.close();
	}

}
