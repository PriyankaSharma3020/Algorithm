package leetcode;

public enum SINgltn {

    SINGLETON(1);

    private final int p;

    SINgltn(int p) {
        this.p=p;
    }
    public int getPriority(){
        return p;
    }
}
