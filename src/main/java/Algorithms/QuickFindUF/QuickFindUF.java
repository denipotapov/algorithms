package Algorithms.QuickFindUF;

public class QuickFindUF {

    private int[] index;

    public QuickFindUF(int indexSize){
        index = new int[indexSize];
        for (int i = 0 ; i < indexSize; i++) {
            index[i] = i;
        }
    }

    private int root(int i) {
        while(i != index[i]) i = index[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        index[root(p)] = root(q);
    }

    public int[] getIndex() {
        return index;
    }
}
