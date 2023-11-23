import java.util.Arrays;
import java.util.PriorityQueue;

public class Kruskal {
    private Subset[] subsets;
    private PriorityQueue<Edge> pq;
    private int minLength=0;

    /*

    CONSTRUCTOR


     */

    public Kruskal(Subset[] subsets, PriorityQueue edges)
    {
        this.subsets = subsets;
        this.pq = edges;
        init();
    }

    /*


    INITIALIZE THE FIELDS


     */

    private void init()
    {
        for(int i=0; i<subsets.length; i++)
        {
            subsets[i].setParent(subsets[i]);
        }
        Arrays.sort(subsets);
        while(!pq.isEmpty()) {
            Edge temp = pq.remove();
            int startIndex = temp.getStart().getTag();
            int finisIndex = temp.getFinish().getTag();
            int edgeWeight = temp.getWeight();


            boolean b1 = union(subsets[startIndex], subsets[finisIndex]);
            if (b1) {
                minLength += edgeWeight;
            }
        }
        System.out.print(minLength);


    }
    /*


    FIND THE ROOT OF EACH V


     */

    public Subset findRoot(Subset s){
        Subset temp = s;
        while(temp.getParent()!=temp)
             temp = temp.getParent();
        return temp;
    }

    /*


    MERGE TWO VERTEXES


     */


    public Boolean union(Subset s1, Subset s2)
    {
        if(findRoot(s1).getTag()==findRoot(s2).getTag())
            return false;
        else if((findRoot(s1)).getTag()<findRoot(s2).getTag()){
            findRoot(s1).setParent(findRoot(s2));
        }
        else
        {
            findRoot(s2).setParent(findRoot(s1));
        }
        return  true;
    }


}