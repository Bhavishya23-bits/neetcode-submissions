class Solution {
    public int maxArea(int[] heights) {
        int right=heights.length-1;
        int left=0;
        int area=0;
        while(right>left){
            int c= Math.min(heights[left],heights[right])*(right-left);
            if(area<c){
                area=c;
            }
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return area;
    }
}
