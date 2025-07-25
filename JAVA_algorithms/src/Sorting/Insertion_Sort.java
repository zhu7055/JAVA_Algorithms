/**
 *
 */
package Sorting;

/**
 *
 */
//1.從數組的未排序部分取得第一個值。
//2.將值移至數組排序部分的正確位置。
//3.根據值的次數再次遍歷數組的未排序部分。

public class Insertion_Sort {

    /**
     * 使用插入排序演算法對整數陣列進行排序。
     *
     * @param arr 要排序的整數陣列。
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i]; // 儲存當前要插入的值
            int j = i - 1;       // 從已排序部分的末尾開始比較

            // 將比 current 大的元素向後移動一個位置
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j]; // 元素後移
                j--;
            }
            arr[j + 1] = current; // 將 current 插入到正確的位置
        }
    }

    public static void main(String[] args) {
        int[] arr = {100, 52, 67, 5, 1, 13, 91, 42};

        System.out.print("未排序陣列: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        // 呼叫 insertionSort 函式進行排序
        insertionSort(arr);

        System.out.print("\n已排序陣列(Insertion Sort): ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
//output:
//未排序陣列: 100 52 67 5 1 13 91 42
//已排序陣列(Insertion Sort): 1 5 13 42 52 67 91 100