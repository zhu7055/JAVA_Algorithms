/**
 *
 */
package Sorting;

/**
 *
 */
//1.具有要排序的值的數組。
//2.選擇要排序的值的外循環。對於數組n值,該外循環跳過第一個值,必須運行 n−1次。
//3.一個內循環,穿過數組的排序部分,以查找在哪裡插入該值。如果要排序的值位於index i、數組的排序部分從索引開始 0，並以索引結束 i−1

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

        System.out.print("\n已排序陣列: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
//output:
//未排序陣列: 100 52 67 5 1 13 91 42
//已排序陣列: 1 5 13 42 52 67 91 100