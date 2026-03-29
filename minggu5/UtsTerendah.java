package minggu5;
public class UtsTerendah {
    int uts[]= {78, 85, 90, 76, 92, 88, 80, 82};
    int nilaiMin(int l, int r){
        if(l == r){
            return uts[l];
        }
        int mid = (l + r) / 2;
        int lmin = nilaiMin(l, mid);
        int rmin = nilaiMin(mid+1, r);

        return Math.min(lmin, rmin);
    }
}
