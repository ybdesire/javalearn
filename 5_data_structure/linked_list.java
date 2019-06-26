import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer>  li = new LinkedList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        System.out.println(li);//[1, 2, 3, 4, 5]

        li.remove(2);// remove by index
        System.out.println(li);//[1, 2, 4, 5]

        li.add(0,6);
        System.out.println(li);//[6, 1, 2, 4, 5]

        System.out.println(li.get(0));//get by index , 6

        li.set(0,8);//set value to 8 at index 0
        System.out.println(li);//[8, 1, 2, 4, 5]

        System.out.println( li.contains(4) );//true

    }
}
