package pl.javastart.task;

import java.util.Arrays;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;
    private double[] przychody = new double[10];
    private double[] wydatki = new double[10];
    private int przychodyLiczba = 0;
    private int wydatkiLiczba = 0;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.opodatkowanieInfo());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", zsumujWydatki());
        if (formaOpodatkowania instanceof PodatekLiniowy || formaOpodatkowania instanceof SkalaPodatkowa) {
            System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(obliczDochod()));
        } else {
            System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow));
        }
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double sumaWydatkow = 0;
        for (double wydatek: wydatki) {
            sumaWydatkow += wydatek;
        }
        return sumaWydatkow;
    }

    private double zsumujPrzychody() {
        double sumaPrzychodow = 0;
        for (double przychod: przychody) {
            sumaPrzychodow += przychod;
        }
        return sumaPrzychodow;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        if (przychodyLiczba >= przychody.length) {
            przychody = Arrays.copyOf(przychody, przychody.length * 2);
        }
        if (przychodyLiczba < przychody.length) {
            przychody[przychodyLiczba] = wartosc;
            przychodyLiczba++;
        }
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        if (wydatkiLiczba >= wydatki.length) {
            wydatki = Arrays.copyOf(wydatki, wydatki.length * 2);
        }
        if (wydatkiLiczba < wydatki.length) {
            wydatki[wydatkiLiczba] = wartosc;
            wydatkiLiczba++;
        }
    }

    private double obliczDochod() {
        return zsumujPrzychody() - zsumujWydatki();
    }
}
