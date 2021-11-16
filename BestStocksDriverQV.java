/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beststocksdriverqv;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Quang Vu
 * U87529813
 */
public class BestStocksDriverQV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, stocks; String name;Scanner input=new Scanner(System.in);
        System.out.print("How many companies' stocks are you interested in?\n" +
"Amount must be >= 1: ");
        num=input.nextInt();
	if(num<1){
	System.out.println("Number must be at least 1.Re-enter: ");
	num=input.nextInt();
	}
	
        BestStocksQV[] a=new BestStocksQV[num];
        for(int i=0;i<num;i++){
            System.out.print("Enter name of company "+(i+1)+": ");
            name=input.nextLine();name=input.nextLine();
            System.out.print("Enter amount of stock (>= 1) for "+name+": ");
            stocks=input.nextInt();
            a[i]=new BestStocksQV(name,stocks);
        }
        System.out.println("Your companies and stocks are:");
        for(int i=0;i<num;i++){
            System.out.print(a[i]);
        }
        NumberFormat cur = NumberFormat.getCurrencyInstance();
        System.out.println("The total amount is: "+ cur.format(BestStocksQV.getTotalCostQV()));
    }
    
}
