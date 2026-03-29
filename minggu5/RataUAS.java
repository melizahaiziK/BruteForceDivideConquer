package minggu5;
public class RataUAS {
    int uas[]={82, 88, 87, 79, 95, 85, 83, 84};

    double hitungRata(){
        int total = 0;
        for(int i = 0; i < uas.length; i++){
            total += uas[i];
        }
        return (double) total / uas.length;
    }
}
