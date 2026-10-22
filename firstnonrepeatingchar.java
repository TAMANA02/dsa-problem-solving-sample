
import java.util.HashMap;

public class firstnonrepeatingchar {

    public static void main(String[] args) {
        String Str = "aabbcde";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int n = 0; n < Str.length(); n++) {
            char ch = Str.charAt(n);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int n = 0; n < Str.length(); n++) {
            char ch = Str.charAt(n);

            if (map.get(ch) == 1) {
                System.out.println(ch);
                return;
            }
        }

        System.out.println("No single character found");
    }
}
