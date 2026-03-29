package minggu5;
public class MainUtsTerendah {
   public static void main(String[] args) {
    UtsTerendah data = new UtsTerendah();
    int hasil = data.nilaiMin(0, data.uts.length - 1);

    System.out.println("Nilai UTS terendah adalah: " + hasil);
   } 
}
