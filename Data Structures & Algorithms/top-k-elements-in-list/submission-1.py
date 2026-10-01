class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # initialize heapmap for counting occurrence frequencies
        count = {}
        # initialize a bucket with each cell as a separate list
        freq = [[] for i in range(len(nums)+1)]

        #counting frequencies of each number into hashmap
        for num in nums:
            count[num] = 1 + count.get(num,0)
        #put each number to the backet cell according to the frequencies
        for number, frequency in count.items():
            freq[frequency].append(number)
        
        res = []
        for i in range(len(freq)-1,0,-1):
            for num in freq[i]:
                res.append(num)
                if len(res)==k:
                    return res
        return res
        
