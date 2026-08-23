class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result=new ArrayList<>();
        while(left<=right){
            int num=left;
            int is_self=1;
            while(num!=0){
                int rem=num%10;

                if(rem==0 ||left%rem!=0)
                {
                    is_self=0;
                    break;
                }
                num/=10;
            }
            if(is_self==1)
            result.add(left);
            left++;
        }
        return result;
        
    }
}