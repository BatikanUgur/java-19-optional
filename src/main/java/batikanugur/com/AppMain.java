package batikanugur.com;

import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppMain {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        System.out.println(student.getIdNumber());
        System.out.println(student.getFirstname());
        System.out.println(student.getLastName());

        System.out.println("------------------------------");

        Student student2 = new Student("Banu");
        System.out.println("Birinci Durum " + student2);
        System.out.println(student2.getIdNumber());
        System.out.println(student2.getFirstname());
        System.out.println(student2.getLastName());

        System.out.println("------------------------------");

        student2 = null;
        System.out.println(student2);
       // System.out.println(student2.getIdNumber());
       // System.out.println(student2.getFirstname());
       // System.out.println(student2.getLastName());

        if(student2 != null) {
            System.out.println("Null değil");
        }else {
            // FIXME burayı düzelteceğiz
            student2 = new Student();
            student2.setIdNumber("1");
            student2.setFirstname("Banu");
            student2.setLastName("Nur");
            System.out.println("İkinci Durum " + student2);
            System.out.println("Durum " + student2.getIdNumber());
        }

        System.out.println("-----------------------------");

        student2 = null;
        try {
            //kodu dene
            student2.setIdNumber("100");
            System.out.println(student2.getIdNumber());
        } catch (Exception e){
            //hata oluştu yakaladık
            System.out.println("hata: " + e);
        }

        System.out.println("--------------------------");

        Optional <Double> ortalama;

        String [] myArray = new String[10];
        myArray[6] = "abc";
        String myWord = myArray[6].toUpperCase();
        System.out.println(myWord);

        System.out.println("Sıra 7: " + myArray[7]);

        myArray[6] = null;
        //System.out.println(myArray[6].toUpperCase());

        System.out.println("------------------------------");

        String [] myArray2 = new String[10];

        myArray2 = null;
        Optional <String[]> nullKontrol = Optional.ofNullable(myArray2);
        System.out.println(nullKontrol);
        //System.out.println(nullKontrol.get());
        //System.out.println(nullKontrol.get().length);

        if(nullKontrol.isEmpty()){
            // Loglama yapılabilir
            System.out.println("Dizi Boş");
        } else {
            System.out.println("Dizi Dolu");
        }

        if(nullKontrol.isPresent()){
            // Loglama yapılabilir
            System.out.println("Dizi Dolu");
        } else {
            System.out.println("Dizi Boş");
        }

        System.out.println("------------------------------");

        String [] myArray3 = new String[10];
       // myArray3[9] = null;
        myArray3[9] = "91";
        Optional <String> nullKontrol3 = Optional.ofNullable(myArray3[9]);
        System.out.println(nullKontrol3);

        System.out.println(nullKontrol3.get());

    if(nullKontrol3.isEmpty()){
        System.out.println("Dizi elemanı boş");
    } else {
        System.out.println("Dizi elemanı dolu " + myArray3[9]);
    }

    }
}