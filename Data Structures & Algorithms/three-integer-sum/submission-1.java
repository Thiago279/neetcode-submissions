class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // two pointers
        // there was some property to = 0
        // sort input array
        // a = - b - c (propery for a+b+c = 0)
        
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++){
            if (i > 0 && nums[i] == nums[i-1]) {
                continue; // Skip this iteration and move to the next 'i'
            }
            int left = i+1;
            int right = nums.length - 1;
            while (left < right){
                int soma = nums[i] + nums[left] + nums[right];
                if (soma == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while(nums[left] == nums[left - 1] && left < right){
                        left++;
                    }
                    right--;
                    while(nums[right] == nums[right + 1] && left< right){//skip duplicates
                        right--;
                    }
                }else if (soma > 0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return res;

    }
}
