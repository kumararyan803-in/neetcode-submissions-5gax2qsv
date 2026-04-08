class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxCount=1;
        int maxVal=nums[0];
        int count=1;
        int val=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }else{
                if(count>maxCount){
                    maxCount=count;
                    maxVal=val;
                }
                count=1;
                val=nums[i];
            }
        }

        if(count>maxCount){
            maxVal=nums[nums.length-1];
        }
        return maxVal;
    }
}