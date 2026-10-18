class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s1=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> a1=new ArrayList<>();
            int req=i;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int target=-nums[req];
                if(nums[left]+ nums[right]>target) right--;
                else if(nums[left]+ nums[right]<target) left++;
                else {
                 s1.add(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    ));
                    left++;
                    right--;
                }
            }
        }
        return new ArrayList(s1);
        
    }
}
