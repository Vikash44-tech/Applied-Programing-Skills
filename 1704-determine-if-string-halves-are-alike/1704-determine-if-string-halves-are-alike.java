class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        s = s.toLowerCase();
        int mid = n / 2;
        String v = "aeiou";
        int count1 = 0,count2 = 0;
        
        for(int i=0;i<mid;i++){
            if(v.indexOf(s.charAt(i)) != -1){
                count1++;
            }
        }
        for(int i = mid;i<n;i++){
            if(v.indexOf(s.charAt(i)) != -1){
                count2++;
            }
        }
        if(count1 == count2){
            return true;
        }
        return false;
    }
}