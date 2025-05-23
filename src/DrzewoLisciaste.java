public class DrzewoLisciaste extends Drzewo{

    public DrzewoLisciaste(boolean wiecznieZielone, String przekrojDrzewa, int wysokosc) {
        super(wiecznieZielone, przekrojDrzewa, wysokosc);
    }
    public int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, String przekrojDrzewa, int wysokosc, int ksztaltLiscia) {
        super(wiecznieZielone, przekrojDrzewa, wysokosc);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString() {

        return super.toString() + " DrzewoLisciaste{" +
                "ksztaltLiscia=" + ksztaltLiscia +
                '}';
    }
}
