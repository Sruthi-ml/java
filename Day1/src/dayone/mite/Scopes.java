package dayone.mite;

public class Scopes 
{
	public static void main(String[] args)
	{
		short block=69; int kart=98;char delivery='D'; boolean overall=true;
		System.out.println(block+" "+kart+" "+delivery+" "+overall);
		System.out.println((char)block+" "+(char)kart+" "+(int)delivery);
		//swapping
		block+=delivery;delivery=(char)(block-delivery);block-=delivery;
		System.out.println(block+" "+delivery);
		//swapping
		kart*=block;block=(short)(kart/block);kart/=block;
		System.out.println(kart+" "+block);
	}
	
}
