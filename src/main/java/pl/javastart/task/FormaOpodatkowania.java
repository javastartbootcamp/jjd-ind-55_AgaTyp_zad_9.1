package pl.javastart.task;

public abstract class FormaOpodatkowania {

    public abstract double wyliczPodatek(double przychody, double wydatki);

    public String opodatkowanieInfo() {
        return "";
    }
}
