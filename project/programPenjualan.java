import java.util.*;

public class programPenjualan {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        String userInput,pilihan;
        String[] namaMinuman={"Pocari Sweat",
        "Coca-Cola",
        "Ultra Milk",
        "Tehbotol Sosro",
        "Buavita Guava"};

        int[] hargaMinuman={6000,
            11000,
            7000,
            8400,
            10000};
            
        tampilkanMenu(namaMinuman, hargaMinuman);

        System.out.print("Input pilihan : ");
        pilihan=inputUser.nextLine();
        
        switch(pilihan){
            case"1":{
                sortingNamaMinumanDescending(namaMinuman, hargaMinuman);
                break;
            }
            case"2":{
                sortingHargaMinumanDescending(namaMinuman, hargaMinuman);
                break;
            }
            case"3":{
                System.out.print("\nCari menu : ");
                userInput=inputUser.nextLine();
                boolean hasil=cariMinumanDalamMenu(namaMinuman,userInput);
                if(hasil==true){
                    System.out.println(userInput+" ada dalam menu");
                }else{
                    System.out.println(userInput+" tidak ada dalam menu");
                }
                break;
            }
            default:{
                System.out.println("Eror");
                break;
            }
        }
    }

    public static void tampilkanMenu(String[] arrayString, int[] arrayInteger) {
        int panjang = (((arrayString.length)+(arrayInteger.length))/2);
        System.out.println("##Program Penjualan Minuman##");
        System.out.println("Nama Minuman\t | Harga Minuman");
        System.out.println("------------------------------");
        for(int i=0;i<panjang;i++){
            System.out.println(arrayString[i]+"\t | "+arrayInteger[i]);
        }
    }
}
