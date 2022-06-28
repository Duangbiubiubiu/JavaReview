import java.util.HashMap; 

public class Main{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        
        map.put("winston", "male");
        map.put("Serena", "Female");

        for(String i : map.keySet()) {
            System.out.println("the key is: " + i + ", and the corresponding value is : " + map.get(i));
        }
        
    }
}

/*要点
 *  1. <key， value>。 一般都是用key去找东西 -> 用get function的时候 map.get(key)
 *  2. Key 和 value declare的type必须是object， int -> Integer, double -> Double
 *  3. key的type和value的type不需要时是一样的
 * 
 */