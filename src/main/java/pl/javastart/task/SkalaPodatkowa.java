package pl.javastart.task;

public class SkalaPodatkowa extends FormaOpodatkowania {
    private static final double PIERWSZY_PROG = 10_000;
    private static final double DRUGI_PROG = 100_000;

    @Override
    public double wyliczPodatek(double dochod) {
        if (dochod - PIERWSZY_PROG <= 0) {
            return 0;
        } else if (dochod - DRUGI_PROG <= 0) {
            return (dochod - PIERWSZY_PROG) * 0.18;
        } else {
            return (DRUGI_PROG - PIERWSZY_PROG) * 0.18 + (dochod - DRUGI_PROG) * 0.32;
        }
    }

    @Override
    public String opodatkowanieInfo() {
        return "Podatek w skali podatkowej";
    }
}
