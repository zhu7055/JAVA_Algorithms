package Tree;

//中序走訪 (In-order Traversal)
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
public class In_Order {
	// 執行中序走訪的方法
	public static void InOrderTraversal(TreeNode node) {
		if(node==null) {
			return;
		}

        // 遞迴地走訪左子樹
        InOrderTraversal(node.left);
        // 訪問當前節點，印出其資料
        System.out.print(node.data + ", ");
        // 遞迴地走訪右子樹
        InOrderTraversal(node.right);
    }
	public static void main(String[] args) {
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
        // 樹的結構如下：
        //         Root
        //        /    \
        //       A      B
        //      / \    / \
        //     D   C  G   E
        //




        root.left = nodeA;   // Root 的left是 A
        root.right = nodeB;  // Root 的right是 B

        nodeA.right = nodeC; // A 的right是 C
        nodeA.left = nodeD;  // A 的left是 D

        nodeB.left = nodeG;  // B 的left是 G
        nodeB.right = nodeE; // B 的right是 E



        // 執行中序走訪
        System.out.println("中序走訪結果:");
        InOrderTraversal(root); // 從根節點開始走訪
		}
	}
/*中序走訪結果:
D, A, C, Root, G, B, E, */

