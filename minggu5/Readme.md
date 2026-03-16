PERTANYAAN PERCOBAAN 1

1.	Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
jawaban : if (n==1) {
    return 1;
}
pada bagian ini disebut base case, digunakan untuk menghentikan proses rekursi

else {
    int fakto = n * faktorialDC(n-1);
    return fakto;
}
jika dibagian ini disebut rekursif case, yang berguna untuk memecah masalah menjadi lebih kecil sesuai konsep DC

2.	Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!
jawaban : memungkinkan, saya menggunakan perulangan while 
int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }  
        return fakto;
    }

3.	Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
jawaban : jika fakto *= i; berarti nilai fakto dikalikan dengan i pada setiap perulangan, perhitungan bertahap dari 1 sampai n.
Jika int fakto = n * faktorialDC(n-1); berarti Nilai n dikalikan dengan hasil pemanggilan fungsi itu sendiri, metode ini menggunakan rekursi, bukan perulangan.

4.	Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF()  dan faktorialDC()!
jawaban : 
-> faktorialBF() menggunakan metode Brute Force dengan perulangan seperti for, while, atau do-while. Perhitungan dilakukan dengan mengkalikan angka secara bertahap dari 1 sampai n dalam satu proses loop.
-> faktorialDC() menggunakan metode Divide and Conquer dengan rekursi, yaitu fungsi memanggil dirinya sendiri dengan nilai yang lebih kecil (n-1) sampai mencapai base case (biasanya n = 1). Setelah itu hasilnya dikalikan kembali saat proses kembali dari rekursi.
