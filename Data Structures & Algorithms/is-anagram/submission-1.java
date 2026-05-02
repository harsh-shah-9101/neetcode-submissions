class Solution {
    public boolean isAnagram(String s, String t) {
        int flag;
        if(s.length()!=t.length()) return false;
        if(s.length()==t.length()){
            char[] tArr = t.toCharArray();
            for(int i=0;i<s.length();i++){
                flag=0;
                for(int j=0;j<tArr.length;j++){
                    if(s.charAt(i)==tArr[j]){
                        flag=1;
                        tArr[j] = ' ';
                        break;
                    }
                }
                if(flag!=1){
                    return false;
                }
            }
        }
        return true;
    }
}
