
import java.util.Scanner;

public class Operations {

    static Scanner input=new Scanner(System.in);

    public static void mainMenu(){

        System.out.println("=========");
        System.out.println("1-Urunleri listele\n" +
                           "2-Urun Ekle\n" +
                           "3-Urun Sil\n" +
                           "4-Urun Ara\n" +
                           "0-Cikis");
        System.out.println("=========");

        String selection=input.next();

        switch (selection){

            case "1":
                listProducts();
                break;
            case "2":
                addProduct();
                break;
            case "3":
                removeProduct();
                break;
            case "4":
                seekProduct();
                break;
            case "0":
                System.out.println("Sistemden cikis yapiliyor...");
                break;
            default:
                System.out.println("Gecersiz bir secim yaptiniz tekrar deneyiniz");

        }

    }

    public static void listProducts(){

        System.out.println("1-Kitaplari listele\n" +
                           "2-Defterleri listele\n" +
                           "3-Ana menu\n" +
                           "0-Cikis");

        String selection= input.next();

        switch (selection){

            case "1":
                BookOperations.listBooks();
                listProducts();
                break;
            case "2":
                NotebookOperations.listNotebooks();
                listProducts();
                break;
            case "3":
                mainMenu();
                break;
            case "0":
                System.out.println("Sitemden cikiliyor...");
                break;
            default:
                System.out.println("Gecersiz bir secim yaptiniz tekrar deneyiniz");
                listProducts();

        }

    }

    public static void addProduct(){

        System.out.println("1-Kitap ekle\n" +
                           "2-Defter ekle\n" +
                           "3-Ana menu\n" +
                           "0-Cikis");

        String selection= input.next();

        switch (selection) {

            case "1":
                BookOperations.addBook();
                break;
            case "2":
                NotebookOperations.addNotebook();
                break;
            case "3":
                mainMenu();
                break;
            case "0":
                System.out.println("Sitemden cikiliyor...");
                break;
            default:
                System.out.println("Gecersiz bir secim yaptiniz tekrar deneyiniz");
                addProduct();
        }
    }

    public static void removeProduct(){

        System.out.println("1-Kitap Sil\n" +
                           "2-Defter Sil\n" +
                           "3-Ana Menu\n" +
                           "0-Cikis");

        String selection= input.next();
        switch (selection){
            case "1":
                BookOperations.removeBook();
                break;
            case "2":
                NotebookOperations.removeNotebook();
                break;
            case "3":
                mainMenu();
                break;
            case "0":
                System.out.println("Sistemden cikis yapiliyor");
                break;
            default:
                System.out.println("Gecersiz secim yaptiniz tekrar deneyiniz");
                removeProduct();
        }

    }

    public static void seekProduct(){

        System.out.println("1-Kitap Ara\n" +
                           "2-Defter Ara\n" +
                           "3-Ana Menu\n" +
                           "0-Cikis");

        String selection= input.next();
        switch (selection){
            case "1":
                BookOperations.seekBook();
                break;
            case "2":
                NotebookOperations.seekNoteBook();
                break;
            case "3":
                mainMenu();
                break;
            case "0":
                System.out.println("Sistemden cikis yapiliyor");
                break;
            default:
                System.out.println("Gecersiz secim yaptiniz tekrar deneyiniz");
                seekProduct();
        }

    }

}
