package minggu5;
public class UtsTertinggi {
    int uts[]= {78, 85, 90, 76, 92, 88, 80, 82};
    int nilaiMax(int l, int r){
        if (l == r) {
            return uts [l];
        }
        int mid = (l +r) / 2;
        int lmax = nilaiMax(l, mid);
        int rmax = nilaiMax(mid+1, r);

        return Math.max(lmax, rmax);
    }
}
