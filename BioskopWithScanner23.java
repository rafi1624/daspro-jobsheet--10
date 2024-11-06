import java.util.Scanner;

public class BioskopWithScanner23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, pilihan;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("-----Menu-----");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu (1/2/3): ");
            pilihan = sc.nextInt();
            sc.nextLine();  

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Penonton: ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan Baris Tempat Duduk (0-3): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan Kolom Tempat Duduk (0-1): ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

                    
                    if (baris >= 0 && baris < 4 && kolom >= 0 && kolom < 2) {
                        if (penonton[baris][kolom] != null) {
                            System.out.println("Kursi sudah terisi, silakan pilih kursi lain.");
                        } else {
                            penonton[baris][kolom] = nama;
                            System.out.println("Data Penonton Berhasil Disimpan");
                            break;
                        }
                    } else {
                        System.out.println("Posisi tidak valid, silakan pilih kursi yang benar.");
                    }
                }

                System.out.print("Input Penonton Lain? (y/n): ");
                next = sc.nextLine();
                if (next.equalsIgnoreCase("n")) {
                    break;
                }

            } else if (pilihan == 2) {
                
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                       
                        String kursi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.println("Baris " + i + ", Kolom " + j + ": " + kursi);
                    }
                }

            } else if (pilihan == 3) {
                System.out.println("Terima kasih!");
                break; 
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }

        
    }
}
