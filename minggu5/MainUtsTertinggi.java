package minggu5;
public class MainUtsTertinggi {
   public static void main(String[] args) {
   UtsTertinggi data = new UtsTertinggi();
   int hasil = data.nilaiMax(0, data.uts.length - 1);

   System.out.println("Nilai UTS tertingi adalah: " + hasil);
   } 
}
