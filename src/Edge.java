public class Edge implements Comparable<Edge>{


    private Subset start;
    private Subset finish;
    private int weight;


    public Edge(Subset start, Subset finish, int weight)
    {
        this.start = start;
        this.finish = finish;
        this.weight = weight;
    }


    @Override
    public int compareTo(Edge o) {
        return weight - o.weight;
    }

    public Subset getStart()
    {
        return start;
    }
    public Subset getFinish()
    {
        return finish;
    }
    public int getWeight()
    {
        return weight;
    }


}
