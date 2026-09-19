class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> name=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String a: strs){
            int freq[]= new int[26];
            for(char b: a.toCharArray()){
                freq[b-'a']++;
            }
            String p=Arrays.toString(freq);
            if(!map.containsKey(p)){
                map.put(p,new ArrayList<>());
            }
            map.get(p).add(a);

        }
        List<List<String>> j= new ArrayList<List<String>> (map.values());
        return j;

        
    }
}
