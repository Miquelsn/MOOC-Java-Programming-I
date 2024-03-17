public class Bird {

    private String name;
    private String nameLatin;
    private Integer observations;
    public Bird(String name, String nameLatin){
        this.name=name;
        this.nameLatin=nameLatin;
        this.observations=0;
    }
    public void observed(){
        this.observations++;
    }
    public String toString(){
        return name+ " ("+ nameLatin  + "): "+ observations + " observations";
    }
    public String getName(){
        return this.name;
    }
    public String getNameLatin(){
        return nameLatin;
    }
    public Integer getObservations(){
        return observations;
    }

}
