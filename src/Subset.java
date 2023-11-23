public class Subset implements Comparable<Subset>{

    private int tag;
    private Subset parent;
    public Subset(int i){
        tag = i;
    }

    public void setParent(Subset parent)
    {
        this.parent = parent;
    }

    public Subset getParent()
    {
        return parent;
    }
    public int getTag()
    {
        return tag;
    }

    @Override
    public int compareTo(Subset o) {
        return tag - o.getTag();
    }
}
