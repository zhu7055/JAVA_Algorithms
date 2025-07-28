package MST;

import java.util.*;
import java.util.Random;
public class Prim {
    // Graph 類別：表示圖的結構和執行 Prim 演算法
    private static class Graph {
        int size;           // 圖中節點的數量
        int[][] adjMatrix;  // 鄰接矩陣：adjMatrix[i][j] 儲存節點 i 和 j 之間的邊權重，如果沒有邊則為 0
        String[] vertexData; // 節點資料：儲存每個節點的名稱（例如 "A", "B" 等）
        boolean[] inMST;    // 布林陣列：inMST[i] 為 true 表示節點 i 已經包含在 MST 中
        int[] keyValues;    // 鍵值陣列：keyValues[i] 儲存節點 i 到目前 MST 中最短邊的權重
        int[] parents;      // 父節點陣列：parents[i] 儲存節點 i 在 MST 中的父節點（用於重建 MST 路徑）

        // 建構子：初始化圖
        public Graph(int size) {
            this.size = size;
            this.adjMatrix = new int[size][size];
            this.vertexData = new String[size];
            this.inMST = new boolean[size];
            this.keyValues = new int[size];
            this.parents = new int[size];

            // 初始化 keyValues 為無限大，表示所有節點都還未連接到 MST
            Arrays.fill(this.keyValues, Integer.MAX_VALUE);
            // 初始化 parents 為 -1，表示所有節點都沒有父節點
            Arrays.fill(this.parents, -1);
        }

        // 添加邊：在無向圖中添加一條邊 (u, v)，權重為 weight
        public void addEdge(int u, int v, int weight) {
            adjMatrix[u][v] = weight;
            adjMatrix[v][u] = weight; // 因為是無向圖，所以要雙向設定
        }

        // 添加節點資料：為指定節點設定其名稱
        public void addVertexData(int vertex, String data) {
            vertexData[vertex] = data;
        }

        // 執行 Prim 演算法，找出最小生成樹 (MST)
        public void primsAlgorithm() {
            // 從節點 0 開始（可以選擇任意節點作為起點），將其鍵值設為 0
            keyValues[0] = 0;

            System.out.println("邊 \t權重"); // 輸出標題

            // 迴圈 size 次，每次將一個節點加入到 MST 中
            for (int count = 0; count < size; count++) {
                int u = -1; // 用於儲存下一個要添加到 MST 的節點索引
                int min = Integer.MAX_VALUE; // 用於尋找最小鍵值

                // 在所有尚未在 MST 中的節點中，找到鍵值最小的節點 u
                for (int v = 0; v < size; v++) {
                    if (!inMST[v] && keyValues[v] < min) {
                        min = keyValues[v];
                        u = v;
                    }
                }

                // 將節點 u 標記為已在 MST 中
                inMST[u] = true;

                // 如果節點 u 有父節點（除了起始節點），則輸出這條邊
                if (parents[u] != -1) {
                    System.out.println(vertexData[parents[u]] + "-" + vertexData[u] + " \t" + adjMatrix[u][parents[u]]);
                }//輸出邊和權重

                // 更新節點 u 的所有鄰居的鍵值
                for (int v = 0; v < size; v++) {
                    // 如果 u 和 v 之間有邊 (adjMatrix[u][v] != 0)，且 v 不在 MST 中，
                    // 並且這條邊的權重小於目前 v 的鍵值
                    if (adjMatrix[u][v] != 0 && !inMST[v] && adjMatrix[u][v] < keyValues[v]) {
                        parents[v] = u;         // 設定 u 為 v 的父節點
                        keyValues[v] = adjMatrix[u][v]; // 更新 v 的鍵值為這條邊的權重
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // 創建一個包含 8 個節點的圖
        Graph g = new Graph(8);

        // 為每個節點設定名稱
        g.addVertexData(0, "A");
        g.addVertexData(1, "B");
        g.addVertexData(2, "C");
        g.addVertexData(3, "D");
        g.addVertexData(4, "E");
        g.addVertexData(5, "F");
        g.addVertexData(6, "G");
        g.addVertexData(7, "H");

        // 添加圖中的邊及其權重
        g.addEdge(0, 1, 4);  // A - B, weight 4
        g.addEdge(0, 3, 5);  // A - D, weight 5
        g.addEdge(1, 2, 7);  // B - C, weight 7
        g.addEdge(1, 3, 2);  // B - D, weight 2
        g.addEdge(1, 4, 10); // B - E, weight 10
        g.addEdge(2, 4, 1);  // C - E, weight 1
        g.addEdge(2, 7, 2);  // C - H, weight 2
        g.addEdge(3, 4, 13); // D - E, weight 13
        g.addEdge(3, 5, 50); // D - F, weight 50
        g.addEdge(4, 5, 35); // E - F, weight 35
        g.addEdge(4, 6, 19); // E - G, weight 19
        g.addEdge(5, 6, 29); // F - G, weight 29
        g.addEdge(6, 7, 1);  // G - H, weight 1

        System.out.println("Prim 演算法 MST:");
        g.primsAlgorithm(); // 執行 Prim 演算法並輸出 MST 的邊
    }
}
/*Prim 演算法 MST:
邊 	權重
A-D 	3
A-B 	4
B-C 	3
C-H 	2
C-E 	4
E-G 	3
D-F 	4*/

/*邊 	權重
A-B 	4
B-D 	2
B-C 	7
C-E 	1
C-H 	2
H-G 	1
G-F 	29*/