import java.util.PriorityQueue;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        /*
        make an array for vertexes
         */
        Subset[] subsets = new Subset[num];
        for(int i=0; i<num; i++)
        {
            subsets[i] = new Subset(i);
        }
        int[][] matrix = new int[num][num];
        /*



        input the matrix




         */
        for (int i=0; i<num; i++)
        {
            for(int j=0; j<num; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        /*


        make an object of edges



         */
        for(int i=0; i<num; i++)
        {
            for (int j=i; j<num; j++)
            {
                if(matrix[i][j] != 0){
                    Subset start = new Subset(i);
                    Subset finish = new Subset(j);
                    start.setParent(start);
                    finish.setParent(finish);
                    pq.add(new Edge(start, finish ,matrix[i][j]));}
            }
        }

        Kruskal kr = new Kruskal(subsets, pq);



    }
}
