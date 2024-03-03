public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbal;

    //Dersler için oluşturulan Stringler
    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int verbal = 0;
    }
    //Öğretmen Ataması ile alakalı koşul
    void addTeacher(Teacher teacher){
       if(teacher.branch.equals(this.prefix)){
           this.teacher = teacher;
       }else{
           System.out.println("Öğretmen ve Ders Uyuşmuyor!");
       }

    }
    void printTeacherInfo(){
        this.teacher.print();
    }
}
