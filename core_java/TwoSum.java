class Solution {

    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
            
        return new int[0]; 
    }
}

public class TwoSum {
    public static void main(String[] args) {

        Solution sol = new Solution();
        int[] ans = sol.twoSum(new int[]{2, 7, 8, 5}, 12);

        System.out.println(ans[0] + " " + ans[1]);
    }
}