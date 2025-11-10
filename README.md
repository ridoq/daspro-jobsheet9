# Percobaan 1 : Mengisi Elemen Array

---
## Soal

1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
3. Ubah statement pada langkah No 4 menjadi seperti berikut:

   ```java
        for(int i = 0; i < 4; i++){
            System.out.println(bil[i]);
        }
   ```

   Apa keluaran dari program? Jelaskan maksud dari statement tersebut.

4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?

---
## Jawaban

1. Akan terjadi error, karena array yang dideklarasikan bertipe integer, yang mana jika valuenya diisi _5.0_ dan _7.5_, program akan error karena tidak ketidak selarasan value dan tipe data
2. Modifikasi untuk nomor 2

    ```java
        int [] bil = {5, 13, -7, 17};
    ```

3. output dari program tetap sama yaitu:

    ```text
    5
    13
    -7
    17
    ```

    maksud Perulangan for pada nomor 3 berfungsi untuk menampilkan semua elemen array bil secara otomatis. Ia dimulai dari indeks 0 hingga 3, dan setiap kali perulangan berjalan, nilai i bertambah satu sehingga program mencetak bil[i] tanpa perlu menulis perintah System.out.println satu per satu.

