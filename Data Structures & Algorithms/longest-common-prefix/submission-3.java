class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        if(strs==null || strs.length==0){
            return "";
        }else if(strs.length==1){
            return strs[0];
        }

        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int maxIndex=Math.min(first.length(),last.length());
        int i=0;
        while(i<maxIndex){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            i++;
        }
        return first.substring(0,i);
    }   
}