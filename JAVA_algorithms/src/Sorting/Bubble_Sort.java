/**
 *
 */
package Sorting;

/**
 *
 */
//1.具有要排序的值的數組。
//2.一個內循環,該循環遍歷數組並在第一個值高於下一個值時交換值。該循環每次運行時必須循環通過少一個值。
//3.控制內環必須運行多少次的外環。對於具有 n 值的數組,該外循環必須運行 n-1 次。
public class Bubble_Sort {

	/**
	 * @param args
	 */
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			boolean swap=false;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(!swap) {
				break;
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100, 52, 67, 5, 1, 13, 91, 42};

        System.out.print("未排序陣列: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        // 呼叫 insertionSort 函式進行排序
        bubbleSort(arr);

        System.out.print("\n已排序陣列(Bubble Sort): ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
	}

}
//output:
//未排序陣列: 100 52 67 5 1 13 91 42
//已排序陣列: 1 5 13 42 52 67 91 100