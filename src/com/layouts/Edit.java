package com.layouts;

import java.util.Scanner;
import com.controllers.DbControllers;
import com.Models.Produk;

public class Edit {
    public static void showEditData(String nama) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("Silahkan Pilih Data yang Ingin Diubah");
        System.out.println("-------------------------------------");
        DbControllers.getDatabase();
        System.out.println("================================");
        System.out.println("Harap Input Nama Produk Dengan Benar");
        System.out.print("Pilih Nama Produk: ");
        nama = sc.nextLine();

        System.out.println("===============================");
        System.out.println("Silahkan Pilih Menu Ubah Data");
        System.out.println("===============================");
        System.out.println("1. Ubah Nama");
        System.out.println("2. Ubah Harga");
        System.out.println("3. Ubah stok");
        System.out.println("4. Back to Menu");

        System.out.println("================================");
        System.out.print("Pilihan: ");
        try {
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                    showEditNama(nama);
                    break;
                case 2:
                    showEditHarga(nama);
                    break;
                case 3:
                    showEditstok(nama);
                    break;
                case 4:
                    Menu.showMenu();
                    break;
                default:
                    System.out.println("============================================");
                    System.out.println("Nama Produk atau Menu yang Dipilih Tidak Ada");
                    System.out.println("--------------------------------------------");
                    Menu.showMenu();
            }
        } catch (Exception e) {
            System.out.println("============================================");
            System.out.println("Nama Produk atau Menu yang Dipilih Tidak Ada");
            System.out.println("--------------------------------------------");
            Menu.showMenu();
        }
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }

    public static void showEditNama(String nama) {
        Scanner sc = new Scanner(System.in);
        Produk produk = DbControllers.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("           Ubah Nama            ");
        System.out.println("================================");
        System.out.println("Nama Awal: " + produk.getNama());
        System.out.println("--------------------------------");
        System.out.print("Nama Baru: ");
        String namaBaru = sc.nextLine();
        DbControllers.updateNama(produk.getId(), namaBaru);

        System.out.println("================================");
        System.out.println("      Nama Berhasil Diubah      ");
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }

    public static void showEditHarga(String nama) {
        Scanner sc = new Scanner(System.in);
        Produk produk = DbControllers.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("           Ubah Harga            ");
        System.out.println("================================");
        System.out.println("Harga Awal: " + produk.getHarga());
        System.out.println("--------------------------------");
        System.out.print("Harga Baru: ");
        long hargaBaru = sc.nextLong();
        DbControllers.updateHarga(produk.getId(), hargaBaru);

        System.out.println("================================");
        System.out.println("   Data Harga Berhasil Diubah   ");
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }

    public static void showEditstok(String nama) {
        Scanner sc = new Scanner(System.in);
        Produk produk = DbControllers.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("           Ubah Stok            ");
        System.out.println("================================");
        System.out.println("Stok Awal: " + produk.getstok());
        System.out.println("--------------------------------");
        System.out.print("Stok Baru: ");
        int stokBaru = sc.nextInt();
        DbControllers.updateStok(produk.getId(), stokBaru);

        System.out.println("================================");
        System.out.println("   Data Stok Berhasil Diubah    ");
        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}

