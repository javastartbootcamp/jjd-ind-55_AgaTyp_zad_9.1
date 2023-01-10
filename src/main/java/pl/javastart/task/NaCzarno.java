package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {


    @Override
    public double wyliczPodatek(double przychody) {
        return 0;
    }

    @Override
    public String opodatkowanieInfo() {
        return "Na Czarno";
    }
}
