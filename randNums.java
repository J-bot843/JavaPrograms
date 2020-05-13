import java.util.Random;

public class randNums {
	public static void main(String args[])
	{
		Random random = new Random();
		
		int randomNum = random.nextInt(100);
		
		System.out.println("A Random Number between 0-99 is : " + randomNum);
	}
}
