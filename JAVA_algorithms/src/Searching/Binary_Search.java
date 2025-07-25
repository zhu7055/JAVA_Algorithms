package Searching;

//1.檢查array中間的值。
//2.如果目標值較低,搜尋array的left。
//如果目標值較高,搜尋right。
//3.繼續步驟 1 和 2,尋找數組的新縮減部分,直到找到target或搜尋區域為空。
//4.如果找到該值,則傳回目標值索引。如果未找到target,則傳回-1。
public class Binary_Search {
	public static int binarySearch(int[] arr,int target) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int middle=(left+right)/2;
			if(arr[middle]==target) {
				return middle;
			}
			if(arr[middle]<target) {
				left=middle+1;
			}
			else {
				right=middle-1;
			}
		}return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] arr = {1,5,13,42,59,67,91,100};
				int target=67;//目標值

		        // 呼叫 bubbleSort 函式進行排序
		        int result=binarySearch(arr,target);
		        if(result!=-1) {
		        		System.out.println("Value "+target+" found in index "+result);
		        }
		        else {
		        		System.out.println("Target 不在 array 中。");
		        }
	}

}
