import java.util.Scanner;

public class programKasir {
        public static void main(String[] args) {
            Scanner pilih= new Scanner(System.in);
            Scanner scan =new Scanner(System.in);
            Scanner makanan=new Scanner(System.in);
            int jumlah=0;
            int bayar=0; int kembali;
            int pilihan=0;
            System.out.println("===Pilihan Menu===");
            System.out.println("1.Bakso");
            System.out.println("2.Mie Ayam");
            System.out.println("3.Mie Pangsit");
            System.out.println("4.Mie Pangsit Bakso");
            System.out.println("5.Mie Ayam Bakso");
            System.out.println("6.Teh Panas/Dingin");
            System.out.println("7.Jeruk Panas/Dingin");
            System.out.println("8.Es Teler");
            for(String opsi="y";opsi.equals("y") || opsi.equals("Y");){

                int porsi;
                System.out.print("Masukan Pilihan Anda = ");
                pilihan=pilih.nextInt();
                if(pilihan==1){
                    System.out.println("Bakso = Rp.7000");
                    System.out.print("Berapa porsi=");
                    porsi=scan.nextInt();
                    jumlah=jumlah+porsi*7000;
                }else if(pilihan==2){
                    System.out.println("Mie Ayam = Rp.6000");
                    System.out.print("Berapa porsi=");
                    porsi=scan.nextInt();
                    jumlah=jumlah+porsi*6000;
                }else if(pilihan==3){
                    System.out.println("Mie Pangsit = Rp.5000");
                    System.out.print("Berapa porsi=");
                    porsi=scan.nextInt();
                    jumlah=jumlah+porsi*5000;
                }else if(pilihan==4){
                    System.out.println("Mie Pangsit Bakso = Rp.7500");
                    System.out.println("Berapa porsi=");
                    porsi=scan.nextInt();
                    jumlah=jumlah+porsi*7500;
                }else if(pilihan==5){
                    System.out.println("Mie Ayam Bakso = Rp.8500");
                    System.out.println("Berapa porsi=");
                    porsi=scan.nextInt();
                    jumlah=jumlah+porsi*8500;
                }else if(pilihan==6){
                    System.out.println("Teh Panas/Dingin = Rp.1500");
                    System.out.println("Berapa porsi=");
                    porsi=scan.nextInt();
                    jumlah=jumlah+porsi*1500;
                }else if(pilihan==7){
                    System.out.println("Jeuruk Panas/Dingin = Rp.2000");
                    System.out.println("Berapa porsi=");
                    porsi=scan.nextInt();
                    jumlah=jumlah+porsi*2000;
                }else if(pilihan==8){
                    System.out.println("Es Teler = Rp.5000");
                    System.out.println("Berapa porsi=");
                    porsi=scan.nextInt();
                    jumlah=jumlah+porsi*5000;
                }

                System.out.println("Ingin Pesan lagi ?");
                System.out.println("Tekan 'Y' untuk Ya dan 'N' untuk Tidak");
                opsi=makanan.nextLine();

            }
            System.out.println("Total "+jumlah);
            System.out.print("Bayar = Rp ");
            bayar=scan.nextInt();
            kembali=bayar-jumlah;
            if(bayar<jumlah){
                System.out.println("Uang anda kurang");
            }else{
                System.out.println("Kembali Rp "+kembali);
            }
        }
}
