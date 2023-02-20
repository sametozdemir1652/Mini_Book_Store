import Concretes.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookOperations {

    static Scanner input=new Scanner(System.in);

    static int bookId =6;
    public static HashMap<Integer, Book> bookHashMap=new HashMap<>();

    public static void bookList(){

        Book book1=new Book(1,"Seker Portakali",30,50,"Jose Mauro De Vasconcelos","Can Yayinevi");
        Book book2=new Book(2,"Simyaci",35,75,"Paulo Coelho","Can Yayinevi");
        Book book3=new Book(3,"Bir Aşk Masali",32.50,100,"Ahmet Umit","Yapi Kredi Yayinlari");
        Book book4=new Book(4,"Saatleri Ayarlama Enstitusu",68.75,25,"Ahmet Hamdi Tanpinar","Alfa Yayinevi");
        Book book5=new Book(5,"Kürk Mantolu Madonna",13,15,"Sabahattin Ali","Yapi Kredi Yayinlari");

        bookHashMap.put(book1.getId(),book1);
        bookHashMap.put(book2.getId(),book2);
        bookHashMap.put(book3.getId(),book3);
        bookHashMap.put(book4.getId(),book4);
        bookHashMap.put(book5.getId(),book5);

    }


    public static void listBooks(){

        for (Map.Entry<Integer, Book> w : bookHashMap.entrySet()) {
            System.out.println(w);
        }
    }

    public static void addBook(){

        System.out.println("Eklemek istediginiz kitabin adini giriniz: ");
        String bookName=input.nextLine();
        System.out.println("Kitabin fiyatini giriniz: ");
        double unitPrice= input.nextDouble();
        System.out.println("Kac adet stok var: ");
        int stock= input.nextInt();
        System.out.println("Yazar adi :");
        input.nextLine();
        String writerName= input.nextLine();
        System.out.println("Yayinevi adi: ");
        String publishingHouse=input.nextLine();

        Book book=new Book(bookId,bookName,unitPrice,stock,writerName,publishingHouse);
        bookHashMap.put(book.getId(), book);
        System.out.println("Urun basariyla eklenmistir");
        bookId++;
        Operations.addProduct();
    }

    public static void removeBook(){

        for (Map.Entry<Integer, Book> w : bookHashMap.entrySet()) {
            System.out.println("Product ID:"+w);
        }
        System.out.println("Silmek istediginiz urunun ID'sini giriniz: ");
        int selection= input.nextInt();

        boolean flag=true;

        if (bookHashMap.keySet().contains(selection)){
            bookHashMap.remove(selection);
            flag=false;
        }

        if (flag){
            System.out.println("Silmek istediginiz ID'ye ait kitap bulunmamaktadir...");
        }

        Operations.removeProduct();

    }

    public static void seekBook(){

        System.out.println("Aradiginiz kitabin adini ya da yayinevini giriniz: ");
        String selection= input.nextLine().trim().toLowerCase();

        boolean flag=true;

        for (Map.Entry<Integer, Book> w : bookHashMap.entrySet()) {
            if (w.getValue().getBookName().toLowerCase().contains(selection) || w.getValue().getPublishingHouse().toLowerCase().contains(selection)){
                System.out.println(w);
                flag=false;
            }
        }

        if (flag){
            System.out.println("Arardiginiz bilgilere ait kitap bulunmamaktadir");
        }
        Operations.seekProduct();
    }




}
