class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }else if(strs.length==1){
            return strs[0];
        }
        String str=strs[0];
        int i=0;
        while(i<str.length()){
        for(int j=1;j<strs.length;j++){
            if(i>=strs[j].length()){
                str=str.substring(0,i);
                break;
            }
            if(strs[j].charAt(i)!=str.charAt(i)){
                str=str.substring(0,i);
                break;
            }
        }
        i++;
        }
        return str;
    }   
}