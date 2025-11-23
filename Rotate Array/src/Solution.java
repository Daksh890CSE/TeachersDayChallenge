import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        int[] rotated=new int[k];
        int[] normal=new int[len-k];
        for(int i=0;i<k;i++){
            rotated[i]=nums[len-k+i];
        }
        for(int i=0;i<len-k;i++){
            normal[i]=nums[i];
        }
        System.arraycopy(rotated, 0, nums, 0, rotated.length);
        System.arraycopy(normal, 0, nums, rotated.length, normal.length);
    }
    public static void main(String[] args){

        Solution obj=new Solution();
        int k=3;
        int[] nums={1,2,3,4,5,6,7};
        obj.rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}