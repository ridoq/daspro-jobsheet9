import java.util.Scanner;
public class TugasKetiga24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hasil = null;
        String[] menu = {
            "Nasi Goreng", "Mie Goreng",
            "Roti Bakar", "Kentang Goreng",
            "Teh Tarik", "Cappucino",
            "Chocolate Ice", "Ayam Geprek",
            "Sate", "Bakso Urat",
            "Es Jeruk", "Kopi",
            "Spageti", "Burger",
            "Soto Ayam", "Nasi Uduk",
            "Jus", "Es Degan",
            "Pizza", "Es Campur"
        };
        System.out.println("=".repeat(50));
        System.out.println("Selamat datang di kafe kami! Silahkan pilih menu :");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("[-] %-20s", menu[i]);
            if ((i + 1) % 2 == 0) { 
                System.out.println();
            }
        }
        System.out.println("-".repeat(50));
        System.out.print("Masukkan menu yang ingin dicari : ");
        String key = sc.nextLine();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                hasil = "Menu " + menu[i] + " tersedia";
                break;
            }
        }
        if (hasil == null) {
            hasil = "Menu " + key + " tidak tersedia";
        }
        System.out.println("-".repeat(50));
        System.out.println("\n" + hasil + "\n");
        sc.close();
    }
}
