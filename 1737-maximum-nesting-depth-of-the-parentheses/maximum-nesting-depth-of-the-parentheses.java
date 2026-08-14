class Solution {
    public int maxDepth(String s) {
        int dept=0;
        int maxdept=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                dept++;
                maxdept=Math.max(dept,maxdept);
            }
            else if(ch==')'){
                dept--;
            }
        }
        return maxdept;
    }
}