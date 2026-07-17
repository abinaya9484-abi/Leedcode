class Solution {
    public int singleNumber(int[] nums) {
        // Using HashMap --> key , value pair --> increasing key value (frequency) --> 0 frequency by default --> element with frequency 1 = single numer.
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        // for each iteration --> default frquency 0 --> adding frequency based on occurance 
        for (int n : nums){
            if(!numsMap.containsKey(n)){
                numsMap.put(n,0);
            }
            numsMap.put(n,numsMap.get(n)+1);
        }
        // another for each iteration --> element with 1 frequency/value --> return single number.
        for (int n : nums){
            if(numsMap.get(n) == 1){
                return n;
            }
        }
        return 0;
    }
    //public int singleNumber(int[] nums) {
        // Using XOR operation --> a^a = 0 , 0^a/a^0 = a 
        // nums = [2,2,1] --> 2^2^1 --> 0^1 --> 1
        
        // int result = 0;
        // for (int n : nums){

        /* [2,2,1]
           ----
           2^2 - 0 --> result = 0;
           0^1 - 1 --> result = 1;
           return result = 1; 
        */

        //    result = result^n ;
        //}
        // return result;   
    //}
}
