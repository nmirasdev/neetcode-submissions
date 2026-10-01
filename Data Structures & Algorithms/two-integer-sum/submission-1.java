class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> prevHashMap = new HashMap<>();

        for(int i=0; i< nums.length;i++){
            int num = nums[i];
            int diff = target - num;

            if(prevHashMap.containsKey(diff)){
                return new int[]{prevHashMap.get(diff),i};
            }
            prevHashMap.put(num,i);
        }
        return new int[]{};
    }
}
