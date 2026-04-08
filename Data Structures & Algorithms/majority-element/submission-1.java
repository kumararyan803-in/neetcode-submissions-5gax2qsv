class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer> freqMap=new HashMap<>();
       int resp=nums[0];
       int maxCount=1;
       for(int i=0;i<nums.length;i++){
        if(freqMap.containsKey(nums[i])){
            int count=freqMap.get(nums[i])+1;
            if(count>maxCount){
                maxCount=count;
                resp=nums[i];
            }
            freqMap.put(nums[i],count);
        }else{
            freqMap.put(nums[i],1);
        }
       }
       return resp;
    }
}