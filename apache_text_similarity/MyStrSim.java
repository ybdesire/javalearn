import org.apache.commons.text.similarity.JaccardSimilarity;

public class MyStrSim
{
    public static void main(String[] args)
    {
        JaccardSimilarity o = new JaccardSimilarity();
        double r = o.apply("hello","000");
        System.out.println(r);
    }
}
/*
how to run
1. download jar
https://mvnrepository.com/artifact/org.apache.commons/commons-text/1.9

2. compile and run with below cmd
E:\code\0829>javac -cp "commons-text-1.9.jar" MyStrSim.java
E:\code\0829>java -cp ".;./commons-text-1.9.jar" MyStrSim
*/