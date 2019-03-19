/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housecostestimation;

/**
 *
 * @author akanksha singh
 */
public class HouseCostEstimation {
public double HouseCostEstimation(int x,double sqft)
{
    if(x==1)
    {
        double result = sqft *1200;// case 1: for standard material
              return result;}
        else if(x==2)
        { double result1 = sqft*1500; // case2 : above standard;
            return result1;
            
    }
    else if(x==3)
        { double result2 = sqft*1800; // case3 : high standard;
            return result2;
}
    else
        { double result3 = sqft*2500; // case4 : high standard and fully automated;
            return result3;}
}
}

