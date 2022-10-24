public class Student {
    String name;
    String studentNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double avarage;
    boolean isPass;
    Student(String name,String studentNo,String classes,Course course1,Course course2,Course course3){
        this.name=name;
        this.studentNo=studentNo;
        this.classes=classes;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1,int note2,int note3) {
    if (note1>=0&&note1<=100){
        course1.note=note1;
    }
    if (note2>=0&&note2<=100){
        course2.note=note2;

    }
    if (note3>=0&&note3<=100){
        course3.note=note3;
    }



    }
    void printNote(){
        System.out.println(course1.name+"Notu\t:"+ course1.note);
        System.out.println(course2.name+"Notu\t:"+ course2.note);
        System.out.println(course3.name+"Notu\t:"+ course3.note);

    }
    void isPass(){
        this.avarage=(course1.note+course2.note+course3.note)/3.0;
        if (this.avarage>=55){
            System.out.println("Hababam sınıfı uyanıyor ! ");
            isPass=true;
        }
        else {
            System.out.println("Hababam sınıfı, sınıfta kaldı!");
            isPass=false;
        }
    }

}
