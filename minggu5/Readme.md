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

PERTANYAAN PERCOBAAN 2

1.	Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
jawaban : di method pangkatBF(), nilai a dikalikan berulang sebanyak n kali menggunakan loop. Jika di method pangkatDC(), Perhitungan pangkat dilakukan dengan memecah masalah menjadi bagian lebih kecil, fungsi memanggil diirnya sendiri sampai mencapai kondisi dasar.

2.	Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
jawaban : ya, sudah, terdapat pada return (pangkatDc(a, n/2) * pangkatDc(a, n/2) * a); pangkatDc(a, n/2) dipanggil dua kali untuk menyelesaikan sub-masalah (conquer), hasil dari kedua pemanggilan tersebut kemudian dikalikan kembali, proses ini merupakan tahap combine atau kombinasi.

3.	Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?
jawaban : Ya, method tersebut bisa dibuat tanpa parameter, dan seperti ini contohnya 
int pangkatBF(){
    int hasil = 1;
    for(int i = 0; i < pangkat; i++){
        hasil = hasil * nilai;
    }
    return hasil;
}

4.	Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
jawaban : 
-> pangkatBF() menggunakan metode Brute Force dengan perulangan, nilai basis dikalikan dengan dirinya sendiri secara berulang sebanyak nilai pangkat sampai menghasilkan hasil akhir.
-> pangkatDC() menggunakan metode Divide and Conquer dengan rekursi, yaitu fungsi memanggil dirinya sendiri dengan nilai pangkat yang lebih kecil (biasanya dibagi dua) hingga mencapai kondisi dasar, kemudian hasilnya digabungkan kembali untuk mendapatkan hasil akhir.

PERTANYAAN PERCOBAAN 3 

1.	Kenapa dibutuhkan variable mid pada method TotalDC()?
jawaban : Variabel mid berfungsi untuk menentukan titik tengah array antara indeks l (left) dan r (right), setelah itu array dibagi 2, 
totalDC(arr, l, mid) → menghitung total pada bagian kiri array
totalDC(arr, mid+1, r) → menghitung total pada bagian kanan array

2.	Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
double lsum = totalDC(arr, l, mid);
double rsum = totalDC(arr, mid+1, r);
jawaban :  digunakan untuk menghitung jumlah elemen array pada dua bagian yang telah dibagi dalam proses algoritma Divide and Conquer. 

totalDC(arr, l, mid) digunakan untuk menghitung total nilai pada bagian kiri array (dari indeks l sampai mid), Hasilnya disimpan pada variabel lsum.
totalDC(arr, mid+1, r) digunakan untuk menghitung total nilai pada bagian kanan array (dari indeks mid+1 sampai r), Hasilnya disimpan pada variabel rsum.

3.	Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?
return lsum+rsum;
jawaban : karena untuk menggabungkan hasil penjumlahan dari 2 bagian array yang telah dihitung sebelumnya, Variabel lsum menyimpan hasil penjumlahan elemen pada bagian kiri array, Variabel rsum menyimpan hasil penjumlahan elemen pada bagian kanan array.
 
4.	Apakah base case dari totalDC()?
jawaban : Ya, benar base casenya dari totalDC(), yaitu dibagian 
if (l == r) {
    return arr[l];
}

5.	Tarik Kesimpulan tentang cara kerja totalDC()
jawaban : Method totalDC() bekerja menggunakan algoritma Divide and Conquer untuk menghitung total nilai elemen dalam array. Cara kerjanya yaitu dengan membagi array menjadi dua bagian, kemudian setiap bagian dihitung jumlahnya secara rekursif sampai mencapai base case. Setelah itu, hasil penjumlahan dari bagian kiri dan kanan digabungkan kembali dengan menjumlahkan lsum dan rsum sehingga diperoleh total keseluruhan elemen array. 
