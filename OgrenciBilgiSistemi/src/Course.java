public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
        int sozlu=0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }
    }

}
