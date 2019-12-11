package c.service;

import c.enums.*;
import c.model.*;

public class OverTimeManager{
    
    public int getOverTimeAmount(OverTimeValues val){
        int amount = 0;
        System.out.println(val);
        switch(val){
            case THREE_HOUR:
                amount = 18000;
                break;
            case FIVE_HOUR:
                amount = 30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount = 40000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amount = 60000;
                break;
        }

        return amount;    
    }
    
}