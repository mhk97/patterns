import java.util.HashMap;

public class _0_Solution {
    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));
    }

    public static int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap();
        for (char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int res = 0;

        for (String word : words) {
            if (word.length() > chars.length()) continue;

            HashMap<Character, Integer> tempMap = new HashMap();
            for (char c : word.toCharArray()) {
                tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
            }

            boolean flag = true;
            for (Character c : tempMap.keySet()) {
                if (map.getOrDefault(c, 0) < tempMap.get(c)) {
                    flag = false;
                    break;
                }
            }

            if (flag) res += word.length();
        }

        return res;
    }
}

