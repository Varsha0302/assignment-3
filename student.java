package v;
import java.util.Scanner;
public class student {
	public static void main ( String []  args) {
		Scanner in = new Scanner(System.in);
		int sid = Integer.parseInt(args[0]);
		String sname =  args[1];
		
		int sub1marks = Integer.parseInt(args[2]);
		
		int sub2marks = Integer.parseInt(args[3]);
		int sub3marks = Integer.parseInt(args[4]);
		int sub4marks = Integer.parseInt(args[5]);
		int sub5marks = Integer.parseInt(args[6]);
		int sub6marks = Integer.parseInt(args[7]);
		
		
		
		
		
		
		System.out.println("studentID:");
		sid = in.nextInt();
		System.out.println("sname:");
		sname =in.next(); 
		
		
		
		System.out.println("subject1 marks: " );
		sub1marks = in.nextInt();
		System.out.println(" subject2 marks: ");
		sub2marks = in.nextInt();
		System.out.println(" subject3 marks: ");
		sub3marks = in.nextInt();
		System.out.println(" subject4 marks: ");
		sub4marks= in.nextInt();
		System.out.println(" subject5 marks: ");
		sub5marks = in.nextInt();
		System.out.println(" subject6 marks: ");
		sub6marks = in.nextInt();
		

		
		
		
		System.out.println (" totalmarks=" +(sub1marks + sub2marks + sub3marks + sub4marks + sub5marks + sub6marks));
		
		System.out.println("average= " +((sub1marks + sub2marks + sub3marks + sub4marks + sub5marks + sub6marks )/6));
				
		
	}
}


