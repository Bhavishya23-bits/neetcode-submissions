class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int a1[]=new int[k];
        int index=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] buckets= new List[nums.length+1];

        for(int a: map.keySet()){
            if(buckets[map.get(a)]==null){
                buckets[map.get(a)]=new ArrayList<>();
            }
            buckets[map.get(a)].add(a);
            }
            
        for(int i=nums.length;i>=1;i--){
            if(buckets[i]!=null){
                for(int a: buckets[i]){
                    a1[index]=a;
                    index++;
                    if(index==k) return a1;
                }
            }
        
        }
        return a1;
        
    }
}