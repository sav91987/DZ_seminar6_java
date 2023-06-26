package NoteBookLibrary;

import java.util.HashSet;

public class SearchSome {

    public static void searchByRam(HashSet<NoteBook> noteSet, int value) {

        for (var item : noteSet) {
            if (value == item.ram) {
                System.out.println(item);
            }
        }
    }

    public static void searchByDiagonal(HashSet<NoteBook> noteSet, int value) {

        for (var item : noteSet) {
            if (value == item.diagonal) {
                System.out.println(item);
            }
        }
    }

    public static void searchByFirm(HashSet<NoteBook> noteSet, String value) {

        for (var item : noteSet) {
            if (value.equals(item.firm)) {
                System.out.println(item);
            }
        }
    }

    public static void searchByCpu(HashSet<NoteBook> noteSet, String value) {

        for (var item : noteSet) {
            if (value.equals(item.cpu)) {
                System.out.println(item);
            }
        }
    }
}
