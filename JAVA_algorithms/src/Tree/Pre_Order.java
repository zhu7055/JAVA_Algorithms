package Tree;

// 前序走訪 (Pre-order Traversal)
// 定義樹節點class
class TreeNode {
    String data;     // 節點儲存的data
    TreeNode left;   // 指向左子節點的
    TreeNode right;  // 指向右子節點的

    // TreeNode 的建構子 (Constructor)
    public TreeNode(String data) {
        this.data = data;    // 初始化節點資料
        this.left = null;    // 初始時左子節點為空
        this.right = null;   // 初始時右子節點為空
    }
}

public class Pre_Order {

    // 執行前序走訪的方法
    public static void PreOrderTraversal(TreeNode node) {
        // 基本情況：如果節點為空，則return(終止遞迴)
        if (node == null) {
            return;
        }
        // 訪問當前節點，印出其資料
        System.out.print(node.data + ", ");
        // 遞迴地走訪左子樹
        PreOrderTraversal(node.left);
        // 遞迴地走訪右子樹
        PreOrderTraversal(node.right);
    }

    public static void main(String[] args) {
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



        // 執行前序走訪
        System.out.println("前序走訪結果:");
        PreOrderTraversal(root); // 從根節點開始走訪
    }
}

/*前序走訪結果:
Root, A, D, C, B, G, E, */