package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {
    @Override
    public double wyliczPodatek(double dochod) {
        return dochod * 0.19;
    }

    @Override
    public String opodatkowanieInfo() {
        return "Podatek liniowy";
    }
}
