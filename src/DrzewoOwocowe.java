public class DrzewoOwocowe extends DrzewoLisciaste{
    public DrzewoOwocowe(boolean wiecznieZielone, String przekrojDrzewa, int wysokosc) {
        super(wiecznieZielone, przekrojDrzewa, wysokosc);
    }
    public String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, String przekrojDrzewa, int wysokosc, int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, przekrojDrzewa, wysokosc, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString() + " DrzewoOwocowe{" +
                "nazwaOwoca='" + nazwaOwoca + '\'' +
                '}';
    }
}
