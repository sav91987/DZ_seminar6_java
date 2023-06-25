package NoteBookLibrary;

import java.util.HashSet;
import java.util.Objects;

public class NoteBook {
    
    public int id;
    public String firm;
    public String model;
    public int diagonal;
    public String cpu;
    public int ram;
    public boolean isDiscreteCard;

    public NoteBook (int id, String firm, String model, int diagonal, String cpu, int ram, boolean isDiscreteCard) {
        this.id = id;
        this.firm = firm;
        this.model = model;
        this.diagonal = diagonal;
        this.cpu = cpu;
        this.ram = ram;
        this.isDiscreteCard = isDiscreteCard;

    }

    public static void printSet(HashSet<NoteBook> noteSet) {
        System.out.println("Ноутбуки:");
        for (var item : noteSet) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "NoteBook [id=" + id + ",\t firm=" + firm + ",\t model=" + model + ",\t diagonal=" + diagonal + ",\t CPU=" + cpu
                + ",\t RAM=" + ram + ",\t isDiscreteCard=" + isDiscreteCard + "]";
    }

    @Override
    public int hashCode() {
       
        return Objects.hash(id, firm, model, diagonal, cpu, ram, isDiscreteCard);
    }

    @Override
    public boolean equals(Object obj) {
        NoteBook note = (NoteBook) obj;
        return firm == note.firm && model == note.model;
    }

    



}
