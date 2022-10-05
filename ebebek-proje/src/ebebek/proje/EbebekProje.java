
package ebebek.proje;

public class EbebekProje {

    public static void main(String[] args) {
        
        Employee employeeAli = new Employee("Ali", 5600, 40, 2000);
        Employee employeeAyse = new Employee("Ayşe", 7500, 48, 2018);
        Employee employeeVeli = new Employee("Veli", 10000, 45, 2005);
        Employee employeeKevser = new Employee("Kevser", 15600, 40, 2016);
        
        employeeAli.to_String();
        employeeAyse.to_String();
        employeeVeli.to_String();
        employeeKevser.to_String();
    }
    
}
