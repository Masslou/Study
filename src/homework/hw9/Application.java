package homework.hw9;

import homework.hw9.storage.AddressBook;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        String delimiter = "-------------------------------------------------";


        AddressBook addressBook = new AddressBook();
        System.out.println(delimiter + " ДОБАВЛЕНИЕ ЗАПИСЕЙ " + delimiter);

        addressBook.addRecord("099 999 99 99", "Подгорный Антон(колхозник)", "бульвар Славы 4");
        addressBook.addRecord("066 666 66 66", "Вабищевич Андрей", "ул. Независимости ДНР, 3");

        System.out.println(addressBook.allRecords());


        System.out.println(delimiter + " СОРТИВКА " + delimiter);
        addressBook.showAllPersonPhoneBookOrderByName();

        System.out.println(delimiter + " ИЗМЕНЕНИЕ ЗАПИСЕЙ " + delimiter);
        addressBook.updateRecord(0, "066 666 66 66", "Вабищевич Андрей", "ул. Независимости Украины, 3");
        System.out.println(addressBook.allRecords());
        System.out.println(delimiter);


        addressBook.removeRecord(0);
        System.out.println(addressBook.allRecords());
        System.out.println(delimiter);

    }
}