package c.enums;

public enum HealthInsurance{
    LEVEL_ONE(1000,0.01),
    LEVEL_TWO(2000,0.02),
    LEVEL_THREE(3000,0.032),
    LEVEL_FOUR(4000,0.045),
    LEVEL_FIVE(5000,0.056),
    LEVEL_SIX(6000,0.071);
    
    final private int maxSalary;
    final private double ratio;
    
    private HealthInsurance(int maxSalary,double ratio){
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }
    
    public double getRatio(){
        return ratio;
    }
    
    public int getMaxSalary(){
        return maxSalary;
    }
    
    public static HealthInsurance getHealthInsurance(int salary){
        HealthInsurance[] hiarr = HealthInsurance.values();
        
        for(HealthInsurance hi : hiarr){
            if(hi.getMaxSalary() >= salary){
                return hi;   
            }
        }
        
        return LEVEL_SIX;
    }
}