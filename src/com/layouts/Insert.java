package com.layouts;

import java.util.Scanner;
import com.controllers.DbControllers;

public class Insert {
    public static void showInsertData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   Silahkan Input Data Produk   ");
        System.out.println("================================");

        System.out.print("Nama Produk : ");
        String name = sc.nextLine();
        System.out.print("Harga       : ");
        long harga = sc.nextLong();
        System.out.print("Jumlah      : ");
        int stok = sc.nextInt();
        System.out.println("================================");

        if (DbControllers.insertData(name, harga, stok)) {
            System.out.println("Data Berhasil Ditambahkan");
        } else {
            System.out.println("Data Gagal Ditambahkan");
        }

        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}

