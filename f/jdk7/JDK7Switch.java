package f.jdk7;

public class JDK7Switch {
    public static void main(String[] args){
        JDK7Switch sample = new JDK7Switch();
        System.out.println(sample.salaryIncreaseAmount(3));
        System.out.println(sample.salaryIncreaseAmount("Engineer"));
    }
    
    public double salaryIncreaseAmount(int employeeLevel){
        switch(employeeLevel){
            case 1:
                return 10.0;
            case 2:
                return 15;
            case 3:
                return 100;
            case 4:
                return 20;
        }
        return 0;
    }
    
    public double salaryIncreaseAmount(String employeeLevel){
        if(employeeLevel == null) return 0;
        
        switch(employeeLevel){
            case "CEO":
                return 10.0;
            case "Manager":
                return 15;
            case "Engineer":
            case "Developer":
                return 100;
            case "Designer":
            case "Planner":
                return 20;
        }
        return 0;
    }
}

