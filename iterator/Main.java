import java.util.ArrayList;
import java.util.Iterator;  //用iterator需要添加这个

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        Iterator<Integer> iterator = list.iterator();   //这个必须放在list操作完之后的下面。 
                                                        //不能放在list所以的操作上面，比如不能放在list.add的上面
        
        
        //iterator的第一个index是 dummy， 不是arrayList index 0 的value， 
        //iterator.next() 才是arrayList index 0 的value。


        while(iterator.hasNext()) {
            Integer i = iterator.next();

            if(i < 3) {
                iterator.remove();
            }
        }

        System.out.println(list);

        
        // iterator.hasNext(); //在当前的obj(Integer) 查看是否有下一个obj
        // iterator.next();    //在当前的obj(Integer) 转到下一个obj（Integer) 
        // iterator.remove();  //吧当前的obj(Integer) remove掉
    }
}

/*要点
 *  1. iterator 就像是pointer一样， 但是他不能够添加data到list里面
 *  2. iterator必须要在一个完整的list后面创建
 *  3. iterator只能对list进行remove data
 * 
 * 什么时候用：
 *  当想要对一个本来就存在的arrayList或者Linkedlist进行操作时，就可以用iterator
 */

