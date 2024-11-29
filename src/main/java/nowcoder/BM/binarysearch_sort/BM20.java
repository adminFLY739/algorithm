package nowcoder.BM.binarysearch_sort;

public class BM20 {
    int count = 0;

    public int InversePairs(int[] array) {
        if (array == null || array.length < 2) {
            return 0;
        }
        splitArray(array, 0, array.length - 1);
        return count;
    }

    public void splitArray(int[] array, int left, int right) {
        int mid = left + (right - left) / 2;
        if (left < right) {// 极限状态下，left和right相邻；若left和right相等，说明递归到头了
            splitArray(array, left, mid);
            splitArray(array, mid + 1, right);
            mergeArray(array, left, mid, right);
        }
    }

    public void mergeArray(int[] array, int left, int mid, int right) {
        int[] arr = new int[right - left + 1];
        int index = 0;
        int start = left;
        int l = left;
        int r = mid + 1;
        while (l <= mid && r <= right) {
            if (array[l] <= array[r]) {
                arr[index++] = array[l++];
            } else {
                arr[index++] = array[r++];
                count += mid + 1 - l;// 右子数组小，往左子数组里面插，计算左子数组剩余
                count %= 1000000007;
            }
        }
        while (l <= mid) {
            arr[index++] = array[l++];
        }
        while (r <= right) {
            arr[index++] = array[r++];
        }
        for (int num : arr) {
            array[start++] = num;
        }
    }
}
