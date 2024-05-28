import java.util.ArrayList;
import java.util.List;

public class DuplicatedElements {

    public static void main(String[] args) {
        List<String> myFavoriteFoods = new ArrayList<>();

        myFavoriteFoods.add("피자");
        myFavoriteFoods.add("치킨");

        boolean containsChicken = myFavoriteFoods.contains("치킨");

        System.out.println("목록에 치킨이 있는가? " + containsChicken);
    }



}
