class Solution {
    public int majorityElement(int[] nums) {
       int resp=nums[0];
       int count=1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]==resp){
            count++;
        }else{
            count--;
            if(count<0){
                resp=nums[i];
                count=1;
            }
        }
       }
       return resp;
    }
}