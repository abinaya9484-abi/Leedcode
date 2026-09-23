class Solution {

    public boolean lemonadeChange(int[] bills) {

        int fives = 0, tens = 0;

        for(int b : bills){

            if(b == 5){

                fives++;

            }else if(b == 10){

                if(fives >= 1){

                    fives--;

                    tens++;

                }else{

                    return false;

                }

            }else{

                if(fives >= 1 && tens >= 1){

                    fives--;

                    tens--;

                }else if(fives >= 3){

                    fives -= 3;

                }else{

                    return false;

                }
            }
        }

        return true;
    }
}