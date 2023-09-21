import java.nio.charset.CoderResult;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBullkExamNote(int note1, int note2, int note3, int sozlu1, int sozlu2, int sozlu3){
        if (note1>=0 && note1<=100){
            this.c1.note=note1;
        }if (note2>=0 && note2<=100){
            this.c2.note=note2;
        }if (note3>=0 && note3<=100){
            this.c3.note=note3;
        }
        if (sozlu1>=0 && sozlu1<=100){
            this.c1.sozlu=sozlu1;
        }if (sozlu2>=0 && sozlu2<=100){
            this.c2.sozlu=sozlu2;
        }if (sozlu3>=0 && sozlu3<=100){
            this.c3.sozlu=sozlu3;
        }
    }
    void printNote(){

        System.out.println("Adı : "+this.name +"\t\t\t\t\tÖğrenci Numarası : "+this.stuNo) ;
        System.out.println(this.c1.name+"Notunuz : " +this.c1.note);
        System.out.println(this.c2.name+"Notunuz : " +this.c2.note);
        System.out.println(this.c3.name+"Notunuz : " +this.c3.note);
        System.out.println("===========================");
        System.out.println(this.c1.name+"Sözlü Notunuz :"+this.c1.sozlu);
        System.out.println(this.c2.name+"Sözlü Notunuz :"+this.c2.sozlu);
        System.out.println(this.c3.name+"Sözlü Notunuz :"+this.c3.sozlu);

        System.out.println("Ortalamanız :" +this.avarage);

    }

    void isPass(){

        this.avarage=((this.c1.note*0.80+this.c1.sozlu*0.20)+(this.c2.note*0.80+this.c2.sozlu*0.20)+(this.c3.note*0.80+this.c3.sozlu*0.20))/3.0;
        if (this.avarage>55){
            System.out.println("\t\t\t\tTEBRİKLER GEÇTİNİZ !");
            this.isPass=true;
        }else {
            System.out.println("\t\t\t\tSINIF TEKRARI");
            this.isPass=false;
        }
        printNote();
        System.out.println("-------------------------");

    }
}