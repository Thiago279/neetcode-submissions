class Solution {
    public int[] twoSum(int[] nums, int target) {
        //map value - index
        // map contains target - value (valueAtual + valueInMap = target )

        HashMap<Integer, Integer> map = new HashMap<>();

        int tamanho = nums.length;

        for(int i = 0; i < tamanho; i++){
            int complemento = target - nums[i];
            if(map.containsKey(complemento)){
                return new int[]{map.get(complemento), i};
            }
            else{
                map.put(nums[i], i);
            }
        }
    return null;

    }
}
