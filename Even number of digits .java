class Solution {
    public int findNumbers(int[] nums) {
        int c1 =0;
        int a=nums.length;
        for(int i=0;i<a;i++)
        {
            int c=0;
            c=(int)Math.log10(nums[i])+1;
            if(c%2==0)
                c1++;
        }
        return c1;    
    }
}
