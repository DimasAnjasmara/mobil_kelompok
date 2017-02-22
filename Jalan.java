package mobil;
import java.util.Scanner;
public class Jalan {
    private static int pilih;
    private static int a;
    public static void main(String [] args) {
        Mobil go = new Mobil (180,0,0);
        Scanner in = new Scanner(System.in);
        while (!go.isStarted()){
            System.out.println("1. Start");
            System.out.println("2. Stop");
            System.out.println("3. Rem");
            System.out.println("4. Ganti Gigi");
            System.out.println("5. Gas");
            System.out.println("");
            System.out.println("Kecepatan Mobil "+ go.getKecAktual());
            System.out.print("Pilihan Anda");
            pilih = in.nextInt();
            switch (pilih) {
                case 1 :
                    go.Start();
                    break;
                case 2 :
                    go.Stop();
                    break;
                case 3 :
                    go.Rem();
                    break;
                case 4 :
                    System.out.println("Pindah Gigi ");
                    int Gigi = in.nextInt();
                    go.gantiGigi(Gigi);
                    break;
                case 5 :
                    go.Gas();
                    break;
                        
                    
            }
        }
        
    }
    
}
