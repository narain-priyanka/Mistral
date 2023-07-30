import java.util.*;
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        String temp = "";
        for (String s : words) {
            char[] carr = s.toCharArray();
            System.out.println(carr);
            Arrays.sort(carr);
            String curr = new String(carr);
            if (!curr.equals(temp))
                ans.add(s);
            temp = curr;
        }
        return ans;
    }

}