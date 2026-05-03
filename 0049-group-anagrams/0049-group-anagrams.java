class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if (map.containsKey(s)) 
                map.get(s).add(i);
            else {
                ArrayList<Integer> k = new ArrayList<>();
                k.add(i);
                map.put(s, k);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for (ArrayList<Integer> l : map.values()) {
            ArrayList<String> ll = new ArrayList<>();

            for (int i : l)
                ll.add(strs[i]);

            ans.add(ll);
        }
        return ans;
    }
}