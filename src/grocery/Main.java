package grocery;

import grocery.models.Contact;
import grocery.models.MobilePhone;
import grocery.models.groceryList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        groceryList groceryList = new groceryList();
        Scanner scanner = new Scanner(System.in);
        int process;

        while (true) {
            System.out.println("Menü:");
            System.out.println("0 - Uygulamayı Durdur");
            System.out.println("1 - Eleman Ekle");
            System.out.println("2 - Eleman Çıkar");

            process = scanner.nextInt();
            scanner.nextLine();

            if (process == 0) {
                System.out.println("Uygulama Durduruldu.");
                break;
            } else if (process == 1) {
                System.out.print("Eklemek istediğiniz elemanları giriniz (virgülle ayırın): ");
                String input = scanner.nextLine();
                String[] newItems = input.split(",");
                for (String newItem : newItems) {
                    groceryList.addItems(newItem.trim());
                }
            } else if (process == 2) {
                System.out.print("Çıkarmak istediğiniz elemanları giriniz (virgülle ayırın): ");
                String inputToRemove = scanner.nextLine();
                String[] itemsToRemove = inputToRemove.split(",");
                for (String itemToRemove : itemsToRemove) {
                    groceryList.removeItems(itemToRemove.trim());
                }
            } else {
                System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }

            groceryList.printSorted();
        }
        System.out.println("Mobile Phone");
        MobilePhone phone = new MobilePhone("123456789");
        Contact person1 = new Contact("negris", "1234567");
        phone.addContact(person1);
        phone.addContact(new Contact("arif", "123456756"));
        phone.addContact(new Contact("burak", "1234567812"));
        phone.printContact();

        System.out.println("index:" + phone.findContact(person1));
        System.out.println("index with string " + phone.findContact(person1.getName()));
        System.out.println("query:" + phone.queryContact(person1.getName()));
        phone.removeContact(person1);
        phone.printContact();


    }
}





