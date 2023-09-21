
public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Ferit","TRH","555 222 0000");
        Teacher t2=new Teacher("Asım","FZK","555 222 1000");
        Teacher t3=new Teacher("Hakkı","BIO","555 222 2000");

        Course tarih=new Course("Tarih ","100","TRH");
        tarih.addTeacher(t1);
        Course fizik=new Course("Fizik ","101","FZK");
        fizik.addTeacher(t2);
        Course biyo=new Course("Biyoloji ","102","BIO");
        biyo.addTeacher(t3);

    Student s1=new Student("Ömer","123","4", tarih, fizik, biyo );
    s1.addBullkExamNote(100,80,50,50,50,50);
    s1.isPass();

    Student s2=new Student("Recep","124","4",tarih, fizik, biyo);
    s2.addBullkExamNote(28,20,32,90,80,100);
    s2.isPass();
    }
}