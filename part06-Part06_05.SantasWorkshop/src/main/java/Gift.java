public class Gift {
    private String name;
    private int weigth;
    public Gift(String name,int weigth){
        this.name=name;
        this.weigth=weigth;
    }
    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weigth;
    }
    public String toString(){
        return name+" (" + weigth+ ")";
    }
}
