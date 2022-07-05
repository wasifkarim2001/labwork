package newproject;
import java.util.Scanner;
public class New1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c,d;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		smallest(a,b,c,d);
	}
	public static void smallest(int a,int b,int c,int d) {
	if(a==b && a==c && a==d)
		System.out.println("All numbers are equal");
		else if(a<b && a<c && a<d)
			System.out.println(a);
		else if(b<c && b<d)
			System.out.println(b);
		else if(c<d)
			System.out.println(c);
		else
			System.out.println(d);
	}
}
 