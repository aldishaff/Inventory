import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        HashMap<String, Integer> Inventori = new HashMap<>();

        Inventori.put("Pensil", 50);
        Inventori.put("Buku", 35);
        Inventori.put("Penghapus", 25);

        System.out.println("Inventori Awal : "+Inventori);
        Inventori.put("Pensil", Inventori.get("Pensil") +20);
        Inventori.remove("Penghapus");
        System.out.println("Inventori setelah update : "+Inventori);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama barang yang ingin dicari : ");
        String barang = scanner.nextLine();
        
        cariBarang(Inventori, barang);
    }

    public static void cariBarang(HashMap<String, Integer> Inventori, String barang){
        if (Inventori.containsKey(barang)){
            System.out.println("Stok "+barang+" : "+Inventori.get(barang)+" unit");
        }else {
            System.out.println("Barang "+barang+" tidak tersedia di inventori");
        }
    }
}