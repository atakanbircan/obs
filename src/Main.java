public class Main {
    public static void main(String[] args) {
        Teacher t1= new Teacher("Necmettin Hoca","MATH","654565656454");
        Teacher t2=new Teacher("Graham Bell","FZK","555");
        Teacher t3=new Teacher("mAHMUT Hoca","TRH","505932564");

        Course matematik=new Course("Matematik","101","MATH");
        Course tarih=new Course("Tarih","122","TRH");
        tarih.addTeacher(t3);
        Course fizik=new Course("Fizik","123","FZK");
        fizik.addTeacher(t2);


        matematik.addTeacher(t1);

        Student talebe1=new Student("ata","456","4.sınıf",tarih,fizik,matematik);
        talebe1.addBulkExamNote(100,85,50);
        talebe1.printNote();
        talebe1.isPass();
        Student talebe2=new Student("Güdük Necmi","852","3.sınıf",tarih,fizik,matematik);
        talebe2.addBulkExamNote(58,62,61);
        talebe2.printNote();
        talebe2.isPass();
    }
}