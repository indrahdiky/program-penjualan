import java.util.*;

public class programPenjualan {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

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
            }
            
        tampilkanMenu(namaMinuman, hargaMinuman);
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
