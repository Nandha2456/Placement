class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;  
            }
        }

        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            if (val <= n) {
                nums[val - 1] = -Math.abs(nums[val - 1]);  
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;  
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        FirstMissingPositive obj = new FirstMissingPositive();
        int[] nums = {3, 4, -1, 1};
        System.out.println("The first missing positive number is: " + obj.firstMissingPositive(nums));
    }
}
