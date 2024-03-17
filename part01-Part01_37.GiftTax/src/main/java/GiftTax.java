
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        Integer price = Integer.parseInt(scan.nextLine());
        if(price>1000000 ){
            System.out.println("Tax: "+ (142100+0.17*(price-1000000)));
        }else if (price>200000){
            System.out.println("Tax: "+ (22100+0.15*(price-200000)));
        }else if (price>55000){
            System.out.println("Tax: "+ (4700+0.12*(price-55000)));
        }else if (price>25000){
            System.out.println("Tax: "+ (1700+0.10*(price-25000)));
        }else if (price>5000){
            System.out.println("Tax: "+ (100+0.08*(price-5000)));
        }else{
            System.out.println("No tax!");
        }
    }
}
