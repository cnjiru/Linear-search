import java.util.ArrayList;
import java.util.Scanner;
public class ArraySearch{
	public static void main(String [] args){
		Scanner n = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter number of Intergers to be inputed");
		int v=n.nextInt();
		System.out.println("Enter numberIntergers");
		for(int i=0; i<v; i++){
			al.add(n.nextInt());
		}
		System.out.println("Intergers are "+ al);
		System.out.println("Input the integer to searchIntergers are ");
		int ds=n.nextInt();
		for(int i=0; i<v; i++){
			if(al.get(i)==ds){
				System.out.println(ds+" is present at location "+(i+1));
				break;
			}
		}
	        
	}
}
