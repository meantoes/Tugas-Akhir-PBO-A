package com.layouts;

import java.util.Scanner;
import com.controllers.DbControllers;

public class Read {
    public static void showReadData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("          Data Produk           ");
        System.out.println("================================");
        DbControllers.getDatabase();
        System.out.println("================================");

        System.out.println("1. Menu");
        System.out.println("2. Keluar");
        System.out.print("Pilih Menu: ");
        try {
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                    Menu.showMenu();
                    break;
                case 2:
                    System.out.println("================================");
                    System.out.println("         Terima Kasih...        ");
                    System.out.println("--------------------------------");
                    System.exit(0);
                default:
                    System.out.println("==============================================================");
                    System.out.println("Menu yang dipilih tidak ada, silahkan pilih menu yang tersedia");
                    System.out.println("--------------------------------------------------------------");

                    Menu.showMenu();
                    System.exit(0);
                    break;
            }
        } catch (Exception e) {
            System.out.println("================================");
            System.out.println("Inputan Error");
            System.out.println("--------------------------------");
            System.exit(0);
        }

        System.out.println("--------------------------------");
        Menu.showMenu();

        sc.close();
    }
}

