import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,turkce,fizik,kimya,muzik;
        int toplam = 0,puan = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz :");
        mat = sc.nextInt();
        if(mat>0 && mat<=100){
             toplam = toplam + mat;
             puan++;
        }

        System.out.print("Türkçe Notunuzu Giriniz :");
        turkce = sc.nextInt();
        if(turkce>0 && turkce<=100){
            toplam = toplam + turkce;
            puan++;
        }
        System.out.print("Fizik Notunuzu Giriniz :");
        fizik = sc.nextInt();
        if(fizik>0 && fizik<=100){
            toplam = toplam + fizik;
            puan++;
        }
        System.out.print("Kimya Notunuzu Giriniz :");
        kimya = sc.nextInt();
        if(kimya>0 && kimya<=100){
            toplam = toplam + kimya;
            puan++;
        }
        System.out.print("Müzik Notunuzu Giriniz :");
        muzik = sc.nextInt();
        if(muzik>0 && muzik<=100){
            toplam = toplam + muzik;
            puan++;
        }

        double avarage = toplam/puan;
        System.out.println("Ortalamanız : " + avarage);
        if (avarage>=55){
            System.out.println("Sınıfı geçtiniz .");

        }else {
            System.out.println("Sınıfı geçemediniz");
        }


    }
}
