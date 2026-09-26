class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int pre[]=new int[nums.length];
        int suf[]=new int[nums.length];
        int num1[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            pre[i]=product;
            product*=nums[i];
            }
        
        product=1;
        for(int i=nums.length;i>0;i--){
            suf[i-1]=product;
            product*=nums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            num1[i]=pre[i]*suf[i];
        }
        


        return num1;
        
    }
}

