public abstract class Test {
    private int versionID;

    public Test(int id){
        this.versionID = id;
    }

    public void setId(int Id){
        this.versionID = Id;
    }

    public abstract float area();
}
