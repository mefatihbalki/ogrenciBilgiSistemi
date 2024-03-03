public class Student {
   Course c1;
   Course c2;
   Course c3;
   String name;
   String stuNo;
   String classes;
   double avarage;
   boolean isPass;

   //Öğrenci girişi gerekli tanımlamalar yapıldı
   Student(String name,String stuNo, String classes,Course c1, Course c2, Course c3){
       this.name = name;
       this.stuNo = stuNo;
       this.classes = classes;
       this.c1 = c1;
       this.c2 = c2;
       this.c3 = c3;
       this.avarage = 0.0;
       this.isPass = false;

   }
//Ders notu
   void addBulkExamNote (int note1, int note2, int note3) {
       if (note1 >=0 && note1 <=100){
           c1.note =note1;
       }
       if (note2 >=0 && note2 <=100) {
           c2.note = note2;
       }
       if (note3 >=0 && note3 <=100) {
           c3.note = note3;
       }
   }
   //Sözlü Sınav Notu
    void addBulkVerbal (int verbal1, int verbal2, int verbal3) {
        if (verbal1 >=0 && verbal1 <=100){
            c1.verbal =verbal1;
        }
        if (verbal2 >=0 && verbal2 <=100) {
            c2.verbal = verbal2;
        }
        if (verbal3 >=0 && verbal3 <=100) {
            c3.verbal = verbal3;
        }
    }
    //Geçme Koşulu
   void isPass(){
       System.out.println("*****************");
       this.avarage = (((this.c1.note + this.c2.note + this.c3.note) / 3.0)*0.80) + (((this.c1.verbal + this.c2.verbal + this.c3.verbal)/3)*0.20);
       if (this.avarage > 55){
           System.out.println("Sınıfı Geçtiniz!!!");
           this.isPass = true;
       }else{
           System.out.println("Sınıfta Kaldınız...");
           this.isPass = false;
       }

       printNote();
   }
   //Sistem Çıktı kısmı
   void printNote(){
       System.out.println(this.c1.name + " Notu\t\t\t\t:" + this.c1.note);
       System.out.println(this.c2.name + " Notu\t\t\t\t:" + this.c2.note);
       System.out.println(this.c3.name + " Notu\t\t\t:" + this.c3.note);
       System.out.println("Ders Ortalamanız\t\t:" + ((this.c1.note + this.c2.note + this.c3.note) / 3.0)*0.80);
       System.out.println("Sözlü Ortalamanız\t\t:" + ((this.c1.verbal + this.c2.verbal + this.c3.verbal)/3)*0.20);
       System.out.println("Toplam Ortalamanız\t\t:" + this.avarage);
   }
}
