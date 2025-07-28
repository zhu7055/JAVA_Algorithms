package Searching;
//線性搜尋
/*1.搜尋target
2.從index 0到後面
3.若發現array裡面有值和target相同
4.回傳index*/

public class Linear_Search {

	public static int LinearSearch(int[] array,int target) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==target) {
				return i;
			}
		}return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {1,5,13,42,59,67,91,100};
		int target=5;
		int result=LinearSearch(array,target);
		if(result!=-1) {
			System.out.println("Value "+ target +" 在 index "+result);
		}
		else {
			System.out.println("Value"+target+"not in array");
		}
	}

}
//Value 5 在 index 1
