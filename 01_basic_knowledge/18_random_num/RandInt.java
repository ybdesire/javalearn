import java.util.Random;

public class RandInt
{

    public static void main(String[] args) 
    {
        int min = 10;
        int max = 20;
        Random r = new Random();
        int rand_int = r.nextInt((max - min) + 1) + min;
        System.out.println(rand_int);
    }

}