package com.app;
import java.util.*;

public class Main{
    public  static void main(String[] args){
        Scanner scanner;
        int pilihan, opsi, sisi, hasil;
        char pengulangan;
        boolean menu = true;
        boolean pilih = true;
        boolean ulang = true;

        scanner = new Scanner(System.in);

        while (menu){
            System.out.println("======MENU UTAMA======");
            System.out.println("Silahkan pilih opsi berikut: ");
            System.out.println("1. Persegi");
            System.out.println("0. keluar");
            System.out.print("pilih (1/0): ");
            pilihan = scanner.nextInt();

            if (pilihan == 0){
                menu = false;
                System.out.println("\nprogram berakhir");
            } else if (pilihan == 1){
                pilih = true;
                while (pilih){
                    System.out.println("\nPersegi");
                    System.out.println("Silahkan pilih opsi berikut: ");
                    System.out.println("1. meghitung luas persegi");
                    System.out.println("2. menghitung keliling persegi");
                    System.out.println("0. kembali");
                    System.out.print("pilih (1/2/0): ");
                    opsi = scanner.nextInt();

                    if (opsi == 0){
                        pilih = false;
                        System.out.println("\n\n");
                    } else if(opsi == 1){
                        ulang = true;
                        while (ulang){
                            System.out.println("\nmenghitung luas persegi");
                            System.out.print("masukkan nilai sisi: ");
                            sisi = scanner.nextInt();
                            hasil = sisi * sisi;
                            System.out.println("hasil: " + hasil);

                            System.out.print("apakah anda ingin menghitung ulang(y/n)");
                            pengulangan = scanner.next().charAt(0);

                            if (pengulangan == 'y'){
                                ulang = true;
                            } else  if (pengulangan == 'n'){
                                ulang = false;
                            } else {
                                System.out.println("opsi yang anda pilih tidak tersedia program akan menganggap anda ingin mengulang");
                            }
                        }
                    } else if(opsi == 2){
                        ulang = true;
                        while (ulang){
                            System.out.println("\nmenghitung keliling persegi");
                            System.out.print("masukkan nilai sisi: ");
                            sisi = scanner.nextInt();
                            hasil = 4 * sisi;
                            System.out.println("hasil: " + hasil);

                            System.out.print("apakah anda ingin menghitung ulang(y/n)");
                            pengulangan = scanner.next().charAt(0);
                            if (pengulangan == 'y'){
                                ulang = true;
                            } else  if (pengulangan == 'n'){
                                ulang = false;
                            } else {
                                System.out.println("opsi yang anda pilih tidak tersedia program akan menganggap anda ingin mengulang");
                            }
                        }
                    }


                    }
                }
            }
        }
}
