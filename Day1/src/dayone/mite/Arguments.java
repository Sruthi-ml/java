package dayone.mite;

public class Arguments {
	public static void main(String[] delta) {
		System.out.println("Candidates Interview");
		String name = null, dept = null; double cgpa=0.0;
		name=delta[0];dept=delta[1];cgpa=Double.parseDouble(delta[2]);
		if(dept.equalsIgnoreCase("cse")||dept.equalsIgnoreCase("ise")) 
		{System.out.println(name+ " Attend on Java");}
		else {System.out.println(name+ " C or Python");}
		if(cgpa>=7.1) {System.out.println("You have 10 questions to attend");}
		else if(cgpa>6.0&&cgpa<7.1)
		{System.out.println("You have 5 questions to attend");}
		else {System.out.println("Not supposed to attend");}
		char status = delta[3].charAt(0);
		System.out.println("Status is "+status);}
		
		
	}


