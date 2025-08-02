package Tree;
//後序走訪 (Post-order Traversal)
//定義樹節點class
/*class TreeNode {
String data;     // 節點儲存的data
TreeNode left;   // 指向左子節點的
TreeNode right;  // 指向右子節點的

// TreeNode 的建構子 (Constructor)
public TreeNode(String data) {
   this.data = data;    // 初始化節點資料
   this.left = null;    // 初始時左子節點為空
   this.right = null;   // 初始時右子節點為空
}
}*/
public class Post_Order {
	// 執行後序走訪的方法
		public static void PostOrderTraversal(TreeNode node) {
			if(node==null) {
				return;
			}
	        // 遞迴地走訪左子樹
	        PostOrderTraversal(node.left);
	        // 遞迴地走訪右子樹
	        PostOrderTraversal(node.right);
	        // 訪問當前節點，印出其資料
	        System.out.print(node.data + ", ");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// 創建樹節點
		        TreeNode root = new TreeNode("Root");
		        TreeNode nodeA = new TreeNode("A");
		        TreeNode nodeB = new TreeNode("B");
		        TreeNode nodeC = new TreeNode("C");
		        TreeNode nodeD = new TreeNode("D");
		        TreeNode nodeE = new TreeNode("E");
		        TreeNode nodeG = new TreeNode("G");

		        // 建構樹的結構
		        // 根據您提供的圖示，樹的結構如下：
		        //         Root
		        //        /    \
		        //       A      B
		        //      / \    / \
		        //     D   C  G   E
		        //

		        // 這裡將其修正為一個獨立的節點，通常在樹中節點不會指向自己。


		        root.left = nodeA;   // Root 的left是 A
		        root.right = nodeB;  // Root 的right是 B

		        nodeA.right = nodeC; // A 的right是 C
		        nodeA.left = nodeD;  // A 的left是 D

		        nodeB.left = nodeG;  // B 的left是 G
		        nodeB.right = nodeE; // B 的right是 E



		        // 執行後序走訪
		        System.out.println("後序走訪結果:");
		        PostOrderTraversal(root); // 從根節點開始走訪
				}
			}
/*後序走訪結果:
D, C, A, G, E, B, Root, */


