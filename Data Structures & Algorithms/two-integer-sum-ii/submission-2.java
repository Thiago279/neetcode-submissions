class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // two sum
        //increasing order
        // O(1) space
        // array of frequency?matrix?(constraints 1000 or 2000)

        //try 2000 size array, 1 on place means present element
        //search for 1 in complement
        // remember array index -1000 because of constraints
        //complement = target - numbers[i]
        // look for freqArray[complement-1000]
        // to insert in freqArray -> +1000
        /*
        int[] freqArray = new int[2000];
        int tamanho = numbers.length;

        for(int i = 0; i < tamanho; i++){/*
            for (int j = i+1; j < tamanho; j++){
                if (numbers[i]+numbers[j] == target){
                    return new int[]{i + 1 , j + 1};
                }
            }
        int complement = target - numbers[i];
        if(freqArray[complement + 1000] == 1){
            return new int[]{i + 1 , complement};
        }
        }
        return null;
        */

        //two pointer solution is better
        //take into account increasing order
        int left = 0;
        int tamanho = numbers.length;
        int right = tamanho-1;

        while(left < right){
            int currSum = numbers[left] + numbers[right];
            if (currSum == target){
                return new int[]{left+1, right+1};
            }
            if (currSum > target){
                right--;
            }else{
                left++;
            } 
        }
        return null;

    }
}
