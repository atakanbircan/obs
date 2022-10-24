public class Teacher {
    String name;
    String telefonNumarasi;
    String branch;

    Teacher(String name,String branch,String telefonNumarasi){
    this.name=name;
    this.telefonNumarasi=telefonNumarasi;
    this.branch=branch;
    }
    void print(){
        System.out.println("Adı : "+this.name);
        System.out.println("Telefon Numarası : "+this.telefonNumarasi);
        System.out.println("Bölümü : "+this.branch);
    }
}
