import java.util.Collections;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer each: arr){
            if(map.get(each)==null){
                map.put(each,1);
            }
            else{
               int val= map.get(each);
               map.put(each,val+1);
            }
        }
        Set<Integer> s= new HashSet<>(map.values());
        return map.size()==s.size();

        
    }
}

// // Store the frequency of elements in the unordered map.
//         Map<Integer, Integer> freq = new HashMap<>();
//         for (int num : arr) {
//             freq.put(num, freq.getOrDefault(num, 0) + 1);
//         }
        
//         // Store the frequency count of elements in the unordered set.
//         Set<Integer> freqSet = new HashSet<>(freq.values());
        
//         // If the set size is equal to the map size, 
//         // It implies frequency counts are unique.
//         return freq.size() == freqSet.size();