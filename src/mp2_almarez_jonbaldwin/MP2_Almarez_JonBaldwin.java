
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mp2_almarez_jonbaldwin;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class MP2_Almarez_JonBaldwin {
    
    public static class paySlip{
        double Gross_income;
        double SSS;
        double Pag_ibig;
        double Philhealth;
        double Withholding_tax = 0;
        double netPay;
        
        public double determineWithholdingTax() {
            
            if(Gross_income < 20000){
                Withholding_tax = Gross_income * 0 ;
            } else if(Gross_income < 31000 && Gross_income > 20000){
                Withholding_tax = Gross_income * 0.20 ;
            } else if(Gross_income < 61000 && Gross_income > 31000){
                Withholding_tax = 2300 + (Gross_income * 0.25) ;
            } else if(Gross_income < 615000 && Gross_income > 154000){
                Withholding_tax = 38000 + (Gross_income * 0.32) ;
            } else if(Gross_income > 615000){
                Withholding_tax = 185000 + (Gross_income * 0.35) ;
            }else 
                System.out.println("Error wrong input:");
            
            return Withholding_tax;
        }
        
        public void deductionsCompensation(){
            System.out.println("deductions:");
            System.out.println(SSS);
            System.out.println(Pag_ibig);
            System.out.println(Philhealth);
            
        }
        
        public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner myObj = new Scanner(System.in); // Initialize a scan name myObj. 
        
        System.out.println("Date Generated: 1/12/19 ");
        
        // Enter user Input.
        System.out.println("Employee Name:   ");
        String employee_name = myObj.nextLine();
        
        System.out.println("Basic Salary:   ");
        double basic_salary = myObj.nextDouble();
        
        System.out.println("Number of overtime:   ");
        double number_of_overtime = myObj.nextDouble();
        
        double OT_pay = number_of_overtime * (basic_salary * 0.1);
        
        paySlip newPaySlip = new paySlip();
        
        // Set attribute values
        newPaySlip.setGross_income(basic_salary , OT_pay);
        newPaySlip.setPag_ibig(basic_salary);
        newPaySlip.setPag_ibig(basic_salary);
        newPaySlip.setPhilhealth(basic_salary);
        newPaySlip.setnetPay(basic_salary);
        
        //Print result.
        System.out.println("Employee Name:  " + employee_name);
        System.out.println("Basic Salary:   " + basic_salary);
        System.out.println("No. of OT Hours:    " + number_of_overtime);
        System.out.println("OT Pay:  " + OT_pay);
        System.out.println("Gross Income:  " + newPaySlip.Gross_income);
        System.out.println("Withholding Tax:  " + newPaySlip.determineWithholdingTax());
        newPaySlip.deductionsCompensation();
        System.out.println("Net Pay:  " + newPaySlip.netPay);
        
        }
         // Setters
        
        public void setGross_income(double basic_salary ,double OT_pay){
            this.Gross_income = basic_salary + OT_pay;
            
        }
        
        public void setSSS(double basic_salary){
            this.SSS = basic_salary * 0.02;
            
        }
        public void setPag_ibig(double basic_salary){
            this.Pag_ibig = basic_salary *0.02 ;
            
        }
        public void setPhilhealth(double basic_salary){
            this.Philhealth = basic_salary * 3.5;
            
        }
        
        public void setnetPay(double basic_salary){
            this.netPay = basic_salary - SSS + Pag_ibig + Philhealth;
        }

        // Getters
        
        public double getGross_income(){
            return this.Gross_income;
        }
        public double getSSS(){
            return this.SSS;
        }
        public double getPag_ibig(){
            return this.Gross_income;
        }
        public double getPhilhealth(){
            return this.Gross_income;
        }
        public double getnetPay(){
            return this.netPay;
        }
    }
}
