# Struktur Folder
Semua folder dan sub-folder yang berisi file penting berada didalam folder `src`.

## Folder com
Dalam folder com terdapat beberapa folder/package yaitu:
1. `config`: berisi file MyConfig.java.
2. `controllers`: berisi file DbControllers.java.
3. `layouts`: berisi beberapa file seperti Delete.java, Edit.java, Insert.java, Menu.java, dan Read.java yang masing-masing berisi fungsi untuk dijalankan di controller.
4. `Models`: berisi file Produk.java yaitu tempat untuk menyimpan fungsi dan objek yang akan digunakan pada file didalam package `layouts`.

## App.java
Main file untuk menjalankan program dengan memanggil Menu.showMenu().



# Keterangan Tambahan

### 1. MyConfig.java
Memanggil dan menyambungkan code dengan database pada MySQL.

### 2. DbControllers.java
Sesuai namanya, file ini berfungsi sebagai pengontrol database melalui fungsi-fungsi yang ada pada folder `layouts`.

### 3. `layouts`
Memiliki beberapa file dengan tugasnya masing-masing.

1. Delete.java untuk menghapus data yang dipilih;
2. Edit.java untuk mengubah data produk yang dipilih seperti nama, harga, dan stok produk;
3. Insert.java bertugas menambahkan data produk yang nantinya akan meminta inputan seperti nama, harga, dan jumlah produk;
4. Menu.java berisi pengkondisian dengan try-catch untuk memilih menu yang tersedia (ubah data, tambah data, dan hapus data);
5. Read.java memiliki tugas untuk menampilkan data produk yang ada pada database.

### 4. try-catch
Setiap fungsi atau pengkondisian memiliki try-catch untuk menangani jika terjadi error dalam penginputan


### 5. Produk.java
Berisi method setter dan getter untuk setiap attribute yang ada.