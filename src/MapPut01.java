import java.util.HashMap;

public class MapPut01 {
    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("chicken", "닭");
        dictionary.put("hippo", "하마");
        dictionary.put("anteater", "개미핥기");

        System.out.println(dictionary);
    }
}
