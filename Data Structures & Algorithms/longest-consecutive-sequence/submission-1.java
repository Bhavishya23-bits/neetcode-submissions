class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> h1=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            h1.add(nums[i]);
        }
        int longest=0;
        int m=1;
        for(int k: h1){
            if(h1.contains(k+1)) m++;
            else{
                if(longest<=m) longest=m;
                m=1;
            }
        }
        return longest;
        
    }
}
