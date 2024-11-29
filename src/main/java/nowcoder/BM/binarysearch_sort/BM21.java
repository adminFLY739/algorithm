package nowcoder.BM.binarysearch_sort;

public class BM21 {
    public int minNumberInRotateArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[left] > nums[mid]) {
                right = mid;
            } else if (nums[left] < nums[mid]) {
                left = mid + 1;
            } else {
                if (left == mid) {
                    return Math.min(nums[left], nums[right]);
                } else {
                    right--;
                }
            }
        }
        return 0;
    }
}
