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

4. output dari program tetap sama yaitu menampilkan array indeks 0-3 namun setelah menampilkan output tersebut terdapat error _ArrayIndexOutOfBoundsException_ hal ini dikarenakan index array yang ditampilkan melebihi panjang data array
---

# Percobaan 1 : Studi Kasus Nilai Mahasiswa di SIAKAD - Meminta Inputan Pengguna untuk Mengisi Elemen Array 

---
## Soal

1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini: 

    ```java
        for(int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
    ```

    Jalankan program. Apakah terjadi perubahan? Mengapa demikian? 

2. Apa yang dimaksud dengan kondisi: _i < nilaiAkhir.length_ ? 
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):

   ```java
        for(int i = 0; i < nilaiAkhir.length; i++){
            if (nilaiAkhir[i] > 70){
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            }
        }
   ```

   Jalankan program dan jelaskan alur program!

4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut:

    ```text
        Masukkan nilai akhir ke-0 : 87
        Masukkan nilai akhir ke-1 : 65
        Masukkan nilai akhir ke-2 : 78
        Masukkan nilai akhir ke-3 : 95  
        Masukkan nilai akhir ke-4 : 92
        Masukkan nilai akhir ke-5 : 58
        Masukkan nilai akhir ke-6 : 89
        Masukkan nilai akhir ke-7 : 67
        Masukkan nilai akhir ke-8 : 85
        Masukkan nilai akhir ke-9 : 78
        Nilai akhir ke-0 lulus!
        Nilai akhir ke-1 tidak lulus!
        Nilai akhir ke-2 lulus!
        Nilai akhir ke-3 lulus!
        Nilai akhir ke-4 lulus!
        Nilai akhir ke-5 tidak lulus!
        Nilai akhir ke-6 lulus!
        Nilai akhir ke-7 tidak lulus!
        Nilai akhir ke-8 lulus!
        Nilai akhir ke-9 lulus!
    ```

---
## Jawaban

1. Tidak terjadi perubahan, karena value _nilaiAkhir.length_ pada kondisi for sama dengan kondisi sebelumnya yaitu = _10_, maka output ketika program dijalankan akan tetap sama.
2. maksud _i < nilaiAkhir.length_ adalah suatu kondisi apabila variable _i_ kurang dari _nilaiAkhir.length_ (panjang data array) bernilai _true_ maka akan menjalankan statement dan akan mengulangi proses tersebut hingga kondisi bernilai false
3. alur kode program ini adalah sebagai berikut: setelah pengguna memasukkan input nilai akhir, kemudian program akan melakukan perulangan sebanyak panjang data array _nilaiAkhir_ karena inisialisasi nya bernilai 0 dan kondisinya menggunakan "kurang dari", apabila kondisi bernilai true maka statementnya adalah sebuah _if_ atau kondisi, kondisi tersebut ialah jika value _nilaiAkhir[i]_ lebih dari 70 maka tampilkan output _"Mahasiswa ke-" + i + " lulus!"_. Jadi sistem hanya akan menampilkan nilaiAkhir mahasiswa yang lebih dari 70/lulus saja
4. 