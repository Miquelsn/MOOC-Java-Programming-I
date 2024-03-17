public class Counter {
    private int value;
    public Counter(int startValue){
        this.value=startValue;
    }
    public Counter(){
        this.value=0;
    }
    public int value(){
        return this.value;
    }
    public void increase(){
        this.value++;
    }
    public void decrease(){
        this.value--;
    }
    public void increase(int step){
        if(step>0){

        
        this.value+=step;
        }
    }
    public void decrease(int step){
        if(step>0){

        
            this.value-=step;
            }
    }
}
