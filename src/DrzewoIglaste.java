public class DrzewoIglaste extends Drzewo{

    public DrzewoIglaste(boolean wiecznieZielone, String przekrojDrzewa, int wysokosc) {
        super(wiecznieZielone, przekrojDrzewa, wysokosc);
    }
    public  int iloscIgiel;
    public double dlugscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, String przekrojDrzewa, int wysokosc, int iloscIgiel, double dlugscSzyszki) {
        super(wiecznieZielone, przekrojDrzewa, wysokosc);
        this.iloscIgiel = iloscIgiel;
        this.dlugscSzyszki = dlugscSzyszki;
    }

    @Override
    public String toString() {

        return super.toString() + " DrzewoIglaste{" +
                "iloscIgiel=" + iloscIgiel +
                ", dlugscSzyszki=" + dlugscSzyszki +
                '}';
    }
}
