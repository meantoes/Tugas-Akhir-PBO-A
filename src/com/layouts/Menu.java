package com.layouts;

import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        System.out.println();
        System.out.println("================================");
        System.out.println("         SELAMAT DATANG         ");
        System.out.println("================================");
        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Ubah Data");
        System.out.println("4. Hapus Data");
        System.out.println("5. Keluar");
        System.out.println("================================");
        System.out.print("Pilih Menu: ");
        selectMenu();
    }

    public static void selectMenu() {
        Scanner sc = new Scanner(System.in);

        try {
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    Read.showReadData();
                    break;
                case 2:
                    Insert.showInsertData();
                    break;
                case 3:
                    Edit.showEditData(null);
                    break;
                case 4:
                    Delete.showDeleteData();
                    break;
                case 5:
                    System.out.println("===============");
                    System.out.println("Terima Kasih...");
                    System.out.println("---------------");
                    System.exit(0);
                default:
                    System.out.println("==============================================================");
                    System.out.println("Menu yang dipilih tidak ada, silahkan pilih menu yang tersedia");
                    System.out.println("--------------------------------------------------------------");
                    showMenu();
            }
        } catch (Exception e) {
            System.out.println("=======================");
            System.out.println("Data yang diinput error");
            System.out.println("-----------------------");
            System.exit(0);
        }

        sc.close();
    }
}

