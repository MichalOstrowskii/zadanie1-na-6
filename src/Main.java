public class Main {
    public static void main(String[] args) {
        String[] nazwy = {"Sosna", "Modrzew", "Dąb", "Osik", "Morelowiec", "Śliwa"};
        Drzewo[] drzewo = new Drzewo[6];
        drzewo[0] = new DrzewoIglaste(true, "50cm", 35, 458, 3.12);
        drzewo[1] = new DrzewoIglaste(false, "79cm", 27, 1046, 8.12);
        drzewo[2] = new DrzewoLisciaste(false, "20cm", 55, 1);
        drzewo[3] = new DrzewoLisciaste(true, "12cm", 14, 4);
        drzewo[4] = new DrzewoOwocowe(false, "6cm", 4, 2, "Morela");
        drzewo[5] = new DrzewoOwocowe(true, "8cm", 3, 9, "Śliwa");
        for(Drzewo x : drzewo)
        {
            System.out.println(x.toString());
        }
    }
}