package guru.qa;

public class Kolbasa {
    int stoimost = 500;
    int ves = 3;
    String skolkoKupit = "Я купил колбасу: ";
    void doKupitKolbasu() {
        System.out.println(skolkoKupit + "на " + stoimost*ves + " рублей");
    }
}
