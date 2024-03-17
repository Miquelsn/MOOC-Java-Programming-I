public class Timer {
    int hundreths;
    int seconds;
    public Timer(){
        hundreths=0;
        seconds=0;
    }

    public String toString(){
        
        return String.format("%02d", seconds)+":"+String.format("%02d", hundreths);
    }
    public void advance(){
        hundreths++;
        if(hundreths==100){
            hundreths=0;
            seconds++;
        }
        if(seconds==60){
            seconds=0;
        }
    }

}
