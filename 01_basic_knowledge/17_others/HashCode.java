public class HashCode
{
    public static void main(String[] args)
    {
        Integer x = 5;
        System.out.println(x.hashCode());//5
        String y = "hi";
        System.out.println(y.hashCode());//3329
        String z = "h";
        System.out.println(z.hashCode());//104
        Character m = 'h';
        System.out.println(m.hashCode());//104
        Character n = 'i';
        System.out.println(n.hashCode());//105
    }
}