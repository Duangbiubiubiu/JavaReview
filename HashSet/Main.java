import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println("original hash set = " +  set);
        
        boolean exist = set.contains(4);
        System.out.println("Check if 4 exit in the set :" + exist);

        exist = set.contains(5);
        System.out.println("Check if 5 exit in the set :" + exist);
        
        int size = set.size(); 
        System.out.println("size of the set:" + size);
    }

    /*要点
     *  1. HashSet的type必须是object （和HashMap一样）
     *  2. HashSet里面所有的value都是独特的（不会有重复的值， 如果本来里面有2， 
     *      再添加一个2的话，那么第二个2不会被添加进去）
     */
}