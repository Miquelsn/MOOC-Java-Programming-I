
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first=0;
        int second=0;

        while (true) {
            System.out.println("First: "+first+"/100");
            System.out.println("Second: "+second+"/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts=input.split(" ");
            if(parts[0].equals("add")){
                if(Integer.parseInt(parts[1])>0)
                first+=Integer.parseInt(parts[1]);
                if(first>100){
                    first=100;
                }
            }

            if(parts[0].equals("move")){
                int quantity=Integer.parseInt(parts[1]);
                if(quantity<0){break;}
                if(first<=quantity){
                    quantity=first;
                }
                first-=quantity;
                second+=quantity;
                if(second>100){
                    second=100;
                }
            }
            if(parts[0].equals("remove")){
                if(Integer.parseInt(parts[1])>0){
                    second-=Integer.parseInt(parts[1]);
                }
                    if(second<0){
                        second=0;
                    }
                
            }
        }
    }


}
