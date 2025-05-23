public class Drzewo {
    public boolean wiecznieZielone;
    public int wysokosc;
    public String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, String przekrojDrzewa, int wysokosc) {
        this.wiecznieZielone = wiecznieZielone;
        this.przekrojDrzewa = przekrojDrzewa;
        this.wysokosc = wysokosc;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "wiecznieZielone=" + wiecznieZielone +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzewa='" + przekrojDrzewa + '\'' +
                '}';
    }
}
