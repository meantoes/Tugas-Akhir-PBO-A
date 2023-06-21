package com.layouts;

import java.util.Scanner;
import com.controllers.DbControllers;

public class Delete {
    public static void showDeleteData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Silahkan Pilih Data yang Ingin Dihapus");
        System.out.println("--------------------------------------");
        DbControllers.getDatabase();
        System.out.println("------------------------------------");
        System.out.println("Harap Input Nama Produk Dengan Benar");
        System.out.print("Pilih Nama Produk: ");
        String nama = sc.nextLine();
        System.out.println("================================");

        if (DbControllers.deleteData(nama)) {
            System.out.println("Data Berhasil Dihapus");
        } else {
            System.out.println("Data Gagal Dihapus");
        }

        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}

