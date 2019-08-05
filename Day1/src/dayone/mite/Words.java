package dayone.mite;

public class Words 
{
	public static void main(String[] args)
	{
		String alpha="Donut"; String oreo = new String("Cupcake");
		System.out.println(alpha=="Donut");
		System.out.println(oreo.equals("Cupcake"));
		System.out.println(alpha.charAt(3));
		System.out.println(oreo.substring(2, oreo.length()));
		System.out.println(alpha.concat("Eclairs"));
		System.out.println(alpha.length());
		oreo=oreo.concat("Jellybean   ");
		System.out.println(oreo.length());
		oreo=oreo.trim();
		System.out.println(oreo.compareToIgnoreCase("cupCAke jeLLybean"));
		byte[] temp = alpha.getBytes();
		System.out.println(alpha+" "+alpha.getBytes());
		System.out.println(new String(temp).toUpperCase());
	}

}
