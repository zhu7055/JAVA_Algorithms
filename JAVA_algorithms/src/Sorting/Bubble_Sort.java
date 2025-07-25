/**
 *
 */
package Sorting;

/**
 *
 */
//1.遍歷數組,一次一個。
//2.對於每個值,將該值與下一個值進行比較。
//3.如果該值高於下一個值,請交換這些值,以便最高值排在最後。
//4.遍歷數組的次數與數組中的值一樣多。

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

        // 呼叫 bubbleSort 函式進行排序
        bubbleSort(arr);

        System.out.print("\n(Bubble Sort)\n已排序陣列: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
	}

}
//output:
//未排序陣列: 100 52 67 5 1 13 91 42
//已排序陣列(Bubble Sort): 1 5 13 42 52 67 91 100