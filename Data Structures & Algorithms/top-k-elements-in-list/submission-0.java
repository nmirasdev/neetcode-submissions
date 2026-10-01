class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        //Initialize each cell of the Bucket
        for(int i=0;i<freq.length;i++)
            freq[i] = new ArrayList<>();

        //count occurences of each number in nums array
        for(int n : nums)
            count.put(n,count.getOrDefault(n,0)+1);

        //Put each number in proper frequence bucket cell according how frequet number is
        for (Map.Entry<Integer,Integer> entry : count.entrySet())
            freq[entry.getValue()].add(entry.getKey());
        
        //Take first kth most frequent numbers and put them into res array
        int[] res = new int[k];
        int index = 0;
        for(int i = freq.length - 1; i>0 && index <k;i--)
        {
            for(int n : freq[i])
            {
                res[index++] = n;
                if(index == k)
                    return res;
            }
        }
        return res;

    }
}
