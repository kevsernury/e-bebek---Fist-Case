package ebebek.proje;

//import java.util.Calendar;

public class Employee {

    String name;
    double salary;
    float workHours;
    int hireYear;

    public Employee(String name, double salary, float workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    private double tax() {
        double tax = 0;
        if (salary >= 1000) {
            tax = salary * 0.03;
        }
        return tax;
    }
    
    private float bonus(){
        float bonus = 0;
        if(workHours > 40){
            bonus = (int)(workHours - 40) * 30;
        }
        return bonus;
    }

    private double raiseSalary(){
        double raise = 0;
        double realSalary = salary - tax() + (double) bonus();
                
        //int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        int thisYear = 2021;
        
        if(thisYear - hireYear < 10){
            raise = (realSalary * 0.05); 
        }
        else if(thisYear - hireYear > 9 && thisYear - hireYear < 20){
            raise = (realSalary * 0.1);
        }
        else if (thisYear - hireYear > 19){
            raise = (realSalary * 0.15);
        }
        return raise;
    }
    
    
    public void to_String(){
        double tax = tax();
        float bonus = bonus();
        double raise = raiseSalary();
        double calculatedSalary = salary + (double) bonus - tax;
        double finalSalary = calculatedSalary + raise ; 
        
        System.out.println("----------------------------");
        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma saati: " + workHours);
        System.out.println("Başlangıç yılı: " + hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş artışı: " + raise);
        System.out.println("Vergi ve bonuslarla birlikte maaş: " + calculatedSalary);
        System.out.println("Toplam maaş: " + finalSalary);
        System.out.println("----------------------------");
        
    }
}