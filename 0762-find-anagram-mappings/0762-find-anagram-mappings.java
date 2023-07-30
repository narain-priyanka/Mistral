class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mapping = new HashMap<>();
        int i=0;
        for(int each: nums2){
            mapping.put(each,i);
            i++;
        }
        int[] arr= new int[nums1.length];
        int j=0;
        for(int each: nums1){   
            arr[j]= mapping.get(each);
            j++;
        }
        return arr;
    }
}