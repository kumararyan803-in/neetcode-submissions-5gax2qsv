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


//str="",i=0
//ch=b,chh=b,b,b; str="b", i=1
//ch=a,chh=a,a,a; str="ba",i=2
//ch=t,chh=g, i=-1; str="ba"