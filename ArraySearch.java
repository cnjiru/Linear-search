import java.util.ArrayList;
import java.util.Scanner;
public class ArraySearch{
	public static void main(String [] args){
		//Scanner n = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		//System.out.println("Enter number of Intergers to be inputed");
		int v=4;
		System.out.println("Number of Intergers 4");
		for(int i=0; i<v; i++){
			al.add(i+1);
		}
		//System.out.println("Intergers are ");
		System.out.println("Input the integer to searchIntergers are ");
		int ds=3;
		for(int i=0; i<v; i++){
			if(al.get(i)==ds){
				System.out.println(ds+" is present at location "+(i+1));
				break;
			}
		}
	        
	}
}
