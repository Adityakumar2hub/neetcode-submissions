class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int j: nums){
            set.add(j);
        }
        int i =1;
        while(true){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
        
        
    }
}