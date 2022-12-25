//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two
// integers m and n, representing the number of elements in nums1 and nums2 respectively.

public class Main {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                // Сдвигаем элемент nums1 вправона одну позицию
                for (int k = m; k > i; k--) {
                    nums1[k] = nums1[k - 1];
                }
                // Вставляем элемент из nums2 в nums1
                nums1[i] = nums2[j];
                i++;
                m++;
                j++;
            }
        }
        // добавляем оствшиеся элементы из списка nums2 в конец списка nums1
        while (j < n) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
}
