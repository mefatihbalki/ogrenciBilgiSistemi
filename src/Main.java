

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","TRH","05305555555");
        Teacher t2 = new Teacher("Mehmet Hoca","FZK","05066666666");
        Teacher t3 = new Teacher("İlke Hoca","BIO","05011111111");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji","101","BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("Fatih Balkı","11","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,78,50);
        s1.addBulkVerbal(50,50,50);
        s1.isPass();

        Student s2 = new Student("İlke Ökmen","42","4",tarih,fizik,biyoloji);
        s2.addBulkExamNote(75,80,98);
        s2.addBulkVerbal(100,100,100);
        s2.isPass();
    }
}