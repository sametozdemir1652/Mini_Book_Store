import Concretes.Book;
import Concretes.Notebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotebookOperations {

    static Scanner input=new Scanner(System.in);

    static int notebookId=5;
    public static HashMap<Integer, Notebook> notebookHashMap=new HashMap<>();

    public static void notebookList(){

        Notebook notebook1=new Notebook(1,"Kareli",25,50,"Gipta","100");
        Notebook notebook2=new Notebook(2,"Cizgili",32,100,"Myline","60");
        Notebook notebook3=new Notebook(3,"Spiralli",50,36,"Kalipso","72");
        Notebook notebook4=new Notebook(4,"Cizgili",16.60,10,"Myline","120");

        notebookHashMap.put(notebook1.getId(),notebook1);
        notebookHashMap.put(notebook2.getId(),notebook2);
        notebookHashMap.put(notebook3.getId(),notebook3);
        notebookHashMap.put(notebook4.getId(),notebook4);

    }


    public static void listNotebooks(){

        for (Map.Entry<Integer, Notebook> w : notebookHashMap.entrySet()) {
            System.out.println(w);
        }
    }

    public static void addNotebook(){


        System.out.println("Eklemek istediginiz defterin adini giriniz: ");

        String notebookName=input.next();

        System.out.println("Defterin fiyatini giriniz: ");
        double unitPrice= input.nextDouble();

        System.out.println("Kac adet stok var: ");
        int stock= input.nextInt();

        System.out.println("Marka :");
        input.nextLine();
        String brandName= input.nextLine();

        System.out.println("Yaprak sayisi: ");
        String numberOfLeaves=input.next();

        Notebook notebook=new Notebook(notebookId,notebookName,unitPrice,stock,brandName,numberOfLeaves);
        notebookHashMap.put(notebook.getId(),notebook);
        System.out.println("Urun basariyla eklenmistir");
        notebookId++;

        Operations.addProduct();

    }


    public static void removeNotebook(){

        for (Map.Entry<Integer, Notebook> w : notebookHashMap.entrySet()) {
            System.out.println("Product ID:"+w);
        }

        System.out.println("Silmek istediginiz urunun ID'sini giriniz: ");
        int selection= input.nextInt();

        boolean flag=true;

        if (notebookHashMap.keySet().contains(selection)){
            notebookHashMap.remove(selection);
            flag=false;
        }
        if (true){
            System.out.println("Silmek istediginiz ID'ye ait defter bulunmamaktadir");
        }
        Operations.removeProduct();

    }

    public static void seekNoteBook(){

        System.out.println("Aradiginiz defterin adini ya da markasini giriniz: ");
        String selection= input.nextLine().trim().toLowerCase();

        boolean flag=true;

        for (Map.Entry<Integer, Notebook> w : notebookHashMap.entrySet()) {
            if (w.getValue().getNotebookName().toLowerCase().contains(selection) || w.getValue().getBrand().toLowerCase().contains(selection)){
                System.out.println(w);
                flag=false;
            }
        }

        if (flag){
            System.out.println("Arardiginiz bilgilere ait defter bulunmamaktadir");
        }
        Operations.seekProduct();

    }

}
