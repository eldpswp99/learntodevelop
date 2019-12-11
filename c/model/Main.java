package c.model;

import c.service.*;
import c.enums.*;

public class Main{
    public static void main(String[] args){
        int[] sarr = {1500,5500,8000};
        
        for(int i = 0;i<3;i++){
            HealthInsurance hi = HealthInsurance.getHealthInsurance(sarr[i]);
            
            System.out.println(hi + " " + hi.getRatio());
        }
            
    }
}