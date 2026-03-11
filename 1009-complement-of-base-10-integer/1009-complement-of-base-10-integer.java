class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        String ans = "";

        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) == '0'){
                ans += '1';
            }else{
                ans += '0';
            }
        }

        return Integer.parseInt(ans, 2);
    }
}