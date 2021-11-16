/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beststocksdriverqv;
import java.text.NumberFormat;

/**
 *
 * @author Quang Vu
 * U87529813
 */
public class BestStocksQV {
    private String name;
    private double pps;
    private int stocks;
    static private double totalCost =0;
    public BestStocksQV(String name, int stocks){
        this.name=name;
        this.stocks=stocks;
        setStockPriceQV();
    }
    private void setStockPriceQV(){
        switch (name.toLowerCase()){
            case "apple": pps=267.84;
            break;
            case "starbucks": pps=85.77;
            break;
            case "NXP Semiconductors": pps=117.41;
            break;
            case "facebook": pps=202.00;
            break;
            case "stitch fix": pps=23.97;
            break;
            case "johnson & johnson": pps=137.75;
            break;
            case "nike": pps=84.14;
            break;
            case "centene corporation": pps=60.44;
            break;
            case "spouts farmer's market": pps=19.45;
            break;
            case "dupont": pps=65.61;
            break;
            // to be continued
            
            
            
        }
        
    }
    private double calCostQV(){
        double cost= pps*stocks;
        addtotalCostQV(cost);
        return cost;
    }
    private static void addtotalCostQV(double cost){
        totalCost=totalCost+cost;
    }
    public static double getTotalCostQV(){
        return totalCost;
    }
    public String toString(){
        NumberFormat cur = NumberFormat.getCurrencyInstance();
        String t = String.format("%-5s",name)
                +String.format("%-20s", cur.format(pps))
                +String.format("%-30s",cur.format(calCostQV()))+"\n";
        return t;
    }
    //end of the class
}
