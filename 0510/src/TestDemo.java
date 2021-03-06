import java.util.*;

/**
 * @program: 0510
 * @description
 * @author: matilda
 * @create: 2020-05-10 08:56
 **/
public class TestDemo {

  public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("我老公","朱一龙");
        map.put("我老婆","石原里美");
        map.put("我","人生赢家");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("我"));
        String s = map.getOrDefault("胡悦","死人");
        System.out.println(s);
        System.out.println(map.containsKey("我老婆"));
        System.out.println(map.containsValue("石原里美"));

        Set<Map.Entry<String,String>> set = map.entrySet();
        for (Map.Entry<String,String> entry : set){
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }
    }

    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("I");
        collection.add("love");
        collection.add("java");
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.remove("java");
        System.out.println(collection);
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));
    }
}
