class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums==null|| nums.length==0){
            return 0;
        }
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[j]==val){
                j--;
            }else if(nums[i]!=val){
                i++;
            }else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }

            if(nums[i]==val){
                return i;
            }else{
                return i+1;
            }
    }
}