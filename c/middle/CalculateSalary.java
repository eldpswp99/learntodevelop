package c.middle;

public class CalculateSalary{
    public static void main(String[] args){
        CalculateSalary cs = new CalculateSalary();
        cs.calculateSalaries();
    }
    
    public long getSalaryIncrease(Employee employee){
        switch(employee.getType()){
            case Employee.owner:
                return (long)(employee.getSalary() * 0.05);
            case Employee.manager:
                return (long)(employee.getSalary() * 1.1);
            case Employee.designer:
                return (long)(employee.getSalary() * 1.2);
            case Employee.architect:
                return (long)(employee.getSalary() * 1.3);
            case Employee.developer:
                return (long)(employee.getSalary() * 2);
        }
        
        return -1L;
    }
    
    public void calculateSalaries(){
        Employee[] earr = new Employee[5];
        earr[0] = new Employee("LeeDaeRi",Employee.owner,1000000000L);
        earr[1] = new Employee("KimManager",Employee.manager,100000000L);
        earr[2] = new Employee("WhangDesign",Employee.designer,70000000L);
        earr[3] = new Employee("ParkArchi",Employee.architect,80000000L);
        earr[4] = new Employee("LeeDevelop",Employee.developer,60000000L);
        
        for(Employee e : earr){
            System.out.println(e.getName()+"="+getSalaryIncrease(e));
        }
    }
}