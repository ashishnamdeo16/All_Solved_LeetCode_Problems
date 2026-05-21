class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        lists = []

        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue   

            l = i + 1
            r = len(nums) - 1

            while l < r:
                sum = nums[i] + nums[l]+ nums[r]
                if sum == 0:
                    nelist = [nums[i],nums[l],nums[r]]
                    lists.append(nelist)
                    l+=1
                    r-=1
                    while l < r and nums[l] == nums[l-1]: l+=1
                    while r >= l and nums[l] == nums[r+1]: r-=1
                elif sum < 0:
                    l+=1    
                else:
                    r-=1

        return lists                