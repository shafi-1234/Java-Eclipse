import java.util.Arrays;
import java.util.Scanner;

public class ReadElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Size of Array : ");
		int size =sc.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of Array : "+add(arr));
		System.out.println("Average Of Array : "+avg(arr));
	}
	static int add(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
		
	}
	static double avg(int arr[]) {
		int sum=0;
		int avg=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			count++;
		}
		avg=sum/count;
		return avg;
	}

}
