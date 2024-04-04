package core;

public class employee {

    int id;
    String name;
    employee(int id, String name)
    {
        this.id=id;
        this.name=name;
    }



    @Override
    public int hashCode() {
        return 1;
    }
}
