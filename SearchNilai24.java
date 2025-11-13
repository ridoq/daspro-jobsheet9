import java.util.Scanner;
public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = 0;
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput:");
        int jumlahInput = sc.nextInt();
        int[] arrNilai = new int[jumlahInput];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                System.out.println();
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
                System.out.println();
                break;
            }
        }
        
        if (hasil == 0) {
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
            System.out.println();
        }
        
        sc.close();
    }
}
