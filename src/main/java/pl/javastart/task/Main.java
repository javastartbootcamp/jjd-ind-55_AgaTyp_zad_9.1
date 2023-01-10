package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new NaCzarno());

        firma.dodajPrzychod("Remont Mieszkania", 20_000);
        firma.dodajWydatek("Gładzie i farby", 1_000);

        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new RyczaltEwidencjonowany());

        janNowakServices.dodajPrzychod("Programowanie", 15_000);
        janNowakServices.dodajWydatek("Energetyki", 200);

        janNowakServices.wyswietlPodsumowanie();

        Firma mechanik = new Firma("Mechanik", new PodatekLiniowy());

        mechanik.dodajPrzychod("Wymiana opon", 80);
        mechanik.dodajPrzychod("Naprawa silnika", 3_000);
        mechanik.dodajWydatek("Silnik", 1_500);

        mechanik.wyswietlPodsumowanie();

        Firma salonSamochodowy = new Firma("Salon Samochodowy Bielak", new SkalaPodatkowa());

        salonSamochodowy.dodajPrzychod("Sprzedaż auta", 150_000);
        salonSamochodowy.dodajWydatek("Myjnia", 1_000);
        salonSamochodowy.dodajWydatek("Pensje", 19_000);

        salonSamochodowy.wyswietlPodsumowanie();
    }

}
