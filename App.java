import java.util.HashSet;

import NoteBookLibrary.NoteBook;

public class App {

    public static void main(String[] args) {

        NoteBook note_1 = new NoteBook(1, "MSI", "MS-112-B", 15, "i5", 16, true);
        NoteBook note_2 = new NoteBook(2, "HP", "HP-17-08", 17, "i7", 8, true);
        NoteBook note_3 = new NoteBook(3, "MSI", "MS-125-8", 15, "i7", 16, false);

        HashSet<NoteBook> noteSet = new HashSet<>();
        noteSet.add(note_1);
        noteSet.add(note_2);
        noteSet.add(note_3);

        NoteBook.printSet(noteSet);

        System.out.println(noteSet.contains(note_1));
        System.out.println(note_1.equals(note_2));
    }

}