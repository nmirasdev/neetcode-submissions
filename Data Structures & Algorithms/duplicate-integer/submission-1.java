class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> appeared = new HashSet<>();
        for(int num: nums){
            if(appeared.contains(num))
                return true;
            appeared.add(num);
        }
        return false;
    }
}