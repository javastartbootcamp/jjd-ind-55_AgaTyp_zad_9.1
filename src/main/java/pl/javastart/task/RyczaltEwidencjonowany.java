package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody) {
        return przychody * 0.15;
    }

    @Override
    public String opodatkowanieInfo() {
        return "Ryczałt ewidencjonowany";
    }
}
