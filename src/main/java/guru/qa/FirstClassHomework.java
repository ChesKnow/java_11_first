package guru.qa;

public class FirstClassHomework {


    public static void main(String[] args) {
        System.out.println(55+44);
        System.out.println(9876-8765);
        System.out.println(4_654_675/4_345);
        System.out.println(4_098_098_098L+44444444L);

        int a = 54674;
        long b = 5_675_678L;
        float f = 56.765f;
        double d = 765.000000000002;
        char someChra = 'r';
        char otherChar = 'v';
        boolean chek = (1>3) && (5!=50);
        boolean chek2 = true | (3>=2) | (0 == (1-1));

        short j = 32767;
        short k = 2;
        //short l = j+k;
        //short t = j - 65536;




        System.out.println(a+b);
        System.out.println(f+d);
        System.out.println(a-b);
        System.out.println(b/a);
        System.out.println(b%a);
        System.out.println(someChra);
        System.out.println(someChra + otherChar); // ошибки нет, но результат не строка(не склеивается)
        System.out.println(chek);
        System.out.println(chek2);

        //System.out.println(l);
        //System.out.println(t);

        Kolbasa kolbasa = new Kolbasa();
        kolbasa.doKupitKolbasu();



    }
}
