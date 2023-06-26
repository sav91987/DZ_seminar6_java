package NoteBookLibrary;

import java.util.HashSet;
import java.util.Scanner;

public class MainMenu {

    public static void mainMenu(HashSet<NoteBook> noteSet) {

        boolean flag = true;
        while (flag) {

            Scanner scan = new Scanner(System.in);
            System.out.println(
                    "Выберите пункт меню: \n\t1. - Поиск по объему ОЗУ\n\t2. - Поиск по ЦПУ\n\t3. - Поиск по фирме производителю\n\t4. - Поиск по размеру диагонали\n\t5. - Показать все ноутбуки\n\t6. - Завершить работу");
            int value = scan.nextInt();

            switch (value) {
                case 1:
                    System.out.println("Введите нужный объем: ");
                    int numb = scan.nextInt();
                    SearchSome.searchByRam(noteSet, numb);
                    ;
                    break;
                case 2:
                    System.out.println("Введите название ЦПУ: ");
                    String str = scan.next();
                    SearchSome.searchByCpu(noteSet, str);
                    break;
                case 3:
                    System.out.println("Введите название фирмы: ");
                    str = scan.next();
                    SearchSome.searchByFirm(noteSet, str);
                    break;
                case 4:
                    System.out.println("Введите размер диагонали: ");
                    numb = scan.nextInt();
                    SearchSome.searchByDiagonal(noteSet, numb);
                    break;
                case 5:
                    NoteBook.printSet(noteSet);
                    break;
                case 6:
                    flag = false;
                    scan.close();
                    break;
            }
        }
    }
}
