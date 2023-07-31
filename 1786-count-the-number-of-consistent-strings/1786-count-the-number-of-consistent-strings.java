class Solution {
    public int countConsistentStrings(String allowed, String[] words) {    
        List<Character> list= new ArrayList<>();
        for(char c: allowed.toCharArray()){
            list.add(c);
        }
        int count =0;
        //check for the presence of charcter in the string array
        for(String word:words){
            if(characterMatch(word,list)){
                count++;
            }
        }
        return count;
    }
    public static boolean characterMatch(String words,List<Character> list){
        for(char c : words.toCharArray()){
            if (!list.contains(c)) {
                return false;
            }
        }
        return true;
    }
}