public class Employee {
    //Tanımlamalarımızı yaptık
    //Nitelikler
    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxDeduction;
    int extra;
    double increase;
    //Kurucu metot oluşturduk ve atamaları yaptık
    Employee(String name,double salary, int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    //Çalışanın vergi dilimine girip girmediği kontrol ediliyor ve ona göre vergisi hesaplanıyor
    double tax() {
        if (this.salary > 1000) {
           return this.taxDeduction = this.salary * 0.03;
        }else {
            return 0;
        }
    }
    //40 saatten fazla bir çalışma süresi varsa fazla mesai ücreti hesaplanıyor
    double extra(){
        if (this.workHours>40){
            return extra=30*(this.workHours-40);
        }
        return 0;
    }
    //Maaş artışını hesaplıyoruz
   double raiseSalary() {
       if (2021 - this.hireYear < 9) {
           return this.increase = this.salary * 0.05;
       } else if (2021 - this.hireYear >= 10 && 2021 - this.hireYear < 19) {
           return this.increase = this.salary * 0.10;
       } else {
           return this.increase = this.salary * 0.15;
       }
   }
   //Ekran çıktılarımızı bastırıyoruz
   //toString olarak intellij kabul etmiyor bu sebeple toStringCalculate olarak ekrana bastırıyoruz
    void toStringCalculate(){
        System.out.println("ÇALIŞANIN;");
        System.out.println("Adı ve Soyadı:  "+this.name);
        System.out.println("Maaşı:  "+this.salary);
        System.out.println("İşe giriş yılı:  "+this.hireYear);
        System.out.println("Vergi Kesintisi:  " +tax());
        System.out.println("Bonus:  "  +extra());
        System.out.println("Maaş Artışı:  "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Maaşı:  "+(this.salary-this.taxDeduction+this.extra));
        System.out.println("Toplam Maaşı:  " +(+this.salary+this.extra+this.increase-this.taxDeduction));
    }
}
