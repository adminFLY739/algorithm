package nowcoder.BM.binarysearch_sort;

public class BM21 {
    public int minNumberInRotateArray(int[] nums) {
        int min = 10001;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

//    public int minNumberInRotateArray(int[] nums) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (nums[left] > nums[mid]) {
//                right = mid;
//            } else if (nums[left] < nums[mid]) {
//                left = mid + 1;
//            } else {
//                if (left == mid) {
//                    return Math.min(nums[left], nums[right]);
//                } else {
//                    return linearSearch(nums, left, right);
//                }
//            }
//        }
//        return 0;
//    }
//
//    private int linearSearch(int[] nums, int left, int right) {
//        int min = nums[left];
//        for (int i = 0; i < right - left + 1; i++) {
//            if (nums[i] < min) {
//                min = nums[i];
//            }
//        }
//        return min;
//    }
}
