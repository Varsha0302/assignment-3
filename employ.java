package v;
import java.util.*;
class Employ
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of employee: ");
	    String n = sc.nextLine();
	    System.out.print("Enter Emloyee id : ");
	    int c = sc.nextInt();
		System.out.println("Enter the basic pay:");
		int basic = sc.nextInt();
		Salary sal = new Salary();
		sal.calculateTotal(basic);
	}
}

class Salary
{
	private double hra;
	private double pf;
	private double ta;
	private double ESI;
	
	void calculateTotal(int basic)
	{
		hra = (2 * basic) / 100;
		pf = (3 * basic) / 100;
		ta = (1 * basic) / 100;
		ESI =(2.5*basic)/ 100; 
		
		double Grosspay = basic + pf + hra + ESI + ta ;
		double netpay = Grosspay - pf;
		System.out.println("Basic Salary:\t" + basic);
		System.out.println("HRA:\t" + hra);
		System.out.println("pf:\t" + pf);
		System.out.println("ta:\t" + ta);
		System.out.println("ESI:\t" + ESI);
		System.out.println("Grosspay:\t" + Grosspay);
		System.out.println("netpay:\t" + netpay);
	}
}