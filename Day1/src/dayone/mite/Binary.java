package dayone.mite;

public class Binary 
{
	public static void main(String[] args)
	{
		char brand1=65; int brand2='h';
		System.out.println(brand1&131);
		System.out.println(brand2|'z');
		//swapping using XOR ^
		brand1^=brand2;brand2^=brand1;brand1^=brand2;
		System.out.println(brand1+" "+(char)brand2);
		//shifting
		System.out.println(brand1>>4);
		System.out.println(brand1<<5);
	}

}
