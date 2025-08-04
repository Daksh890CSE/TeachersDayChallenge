import java.util.*;


class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        int[] rotated=new int[k];
        int[] normal=new int[len-k];
        int[] rotated_arr=new int[len];
        for(int i=len-k;i<len;i++){
            for(int j=0;j<k;j++){
                rotated[j]=nums[i];
            }
        }
        for(int i=0;i<len-k;i++){
            normal[i]=nums[i];
        }
        System.arraycopy(rotated, 0, rotated_arr, 0, rotated.length);
        System.arraycopy(normal, 0, rotated_arr, rotated.length, normal.length);
    }
    public static void mina(String[] args){
        Scanner kb=new Scanner(System.in);
    }
}