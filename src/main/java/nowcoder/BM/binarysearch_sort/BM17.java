package nowcoder.BM.binarysearch_sort;

public class BM17 {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int index = (i + j) / 2;
            if (nums[index] == target) {
                return index;
            } else if (nums[index] > target) {
                j = index - 1;
            } else {
                i = index + 1;
            }
        }
        return -1;
    }
}
