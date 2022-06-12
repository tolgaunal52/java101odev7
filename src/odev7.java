import java.util.Scanner;

public class odev7 {
    public static void main(String[] args) {
        double  toplam,armut,arm, ar= 2.14, elma,elm,el = 3.67, domates,doma,dom = 1.11, muz,muzi,mu = 0.95, patlican,patli,pat = 5.00, a, e, d, m, p;

        Scanner input = new Scanner(System.in);

        System.out.println("Hosgeldiniz");
        System.out.println("Urunlerin Fiyatini Ogrenmek Icin Miktarlarini KG Cinsinden Giriniz.");
        System.out.println("(Lufen Ondalik Kisimlari NOKTA ile degil VIRGUL ile ayirin !!!)");
        System.out.print("\nArmut Kac Kilo ? : ");
        armut = input.nextDouble();
        a = armut <=0 ? 0 : armut ;
        arm=a*ar;

        System.out.print("Elma Kac Kilo ? : ");
        elma = input.nextDouble();
        e = elma <=0 ? 0 : elma;
        elm=e*el;

        System.out.print("Domates Kac Kilo ? : ");
        domates = input.nextDouble();
        d = domates <=0 ? 0 : domates;
        doma=d*dom;

        System.out.print("Muz Kac Kilo ? : ");
        muz = input.nextDouble();
        m = muz <=0 ? 0 : muz;
        muzi=m*mu;

        System.out.print("Patlican Kac Kilo ? : ");
        patlican = input.nextDouble();
        p = patlican <=0 ? 0 : patlican;
        patli=p*pat;

        System.out.println("\nArmut : " + arm + " TL");
        System.out.println("Elma : " + elm + " TL");
        System.out.println("Domates : " + doma + " TL");
        System.out.println("Muz : " + muzi + " TL");
        System.out.println("Patlican : " + patli + " TL");
        toplam = arm+elm+doma+muzi+patli;
        System.out.println("\nToplam : " + toplam + " TL");

    }
}
