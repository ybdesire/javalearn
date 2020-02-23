import java.util.Random;//before java1.7
import java.util.concurrent.ThreadLocalRandom;//after java1.7




public class RandomNum
{
	public static void main(String[] args)
	{
		int max = 100;
		int min = 50;
		
		//before java1.7
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		System.out.println("random: " + randomNum);
		
		//after java1.7
		randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		System.out.println("random: " + randomNum);

	}
}