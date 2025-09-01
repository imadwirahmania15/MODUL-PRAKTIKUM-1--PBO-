# MODUL-PRAKTIKUM-1--PBO-
Tugas 
# 1. Apa yang dimaksud dengan kelas dalam PBO?
Kelas merupakan salah satu konsep PBO yaitu sekumpulan entitas berupa data (atribut) dan perilaku (metode) yang nantinya digunakan untuk membuat objek

# 2. Bagaimana cara kerja atribut dan method dalam kelas? 
Atribut adalah data (variabel) dari suatu objek, misalnya pada kelas mobil, atributnya bisa berupa warna, merk, dan tahun.  
Cara kerja Atribut menyimpan data yang menjadi identitas atau informasi dari objek tersebut.

Method adalah tindakan atau perilaku yang bisa dilakukan suatu objek, biasanya digunakan untuk mengakses data, misalnya pada kelas Mobil, methodnya bisa berupa mengemudi, mundur, mengerem, dll
Cara kerja method adalah menjalankan aksi sesuai dengan perintah yang diberikan objek, sehingga objek dapat berperilaku sesuai fungsi yang sudah didefinisikan dalam kelas.

# 3. Apa perbedaan antara method yang mengembalikan nilai dan yang tidak?
# Method yang mengembalikkan nilai (Accessor/getter) 
- Nama method diawali dengan get…
- Harus ada perintah return untuk mengembalikan data
- Untuk mengambil data dari objek
# Method yang tidak mengembalikkan nilai (Mutator/Setter)
- Ditulis dengan tipe void
- Nama method biasanya diawali dengan set…
- Tidak menggunakan return
- Untuk mengubah data atau melakukan aksi pada objek

# 4. Bagaimana method berinteraksi dengan atribut dalam kelas?
Method berinteraksi dengan atribut dalam kelas dengan cara mengakses (membaca), mengubah, dan memanfaatkan data atribut tersebut supaya objek bisa berperilaku sesuai 
fungsinya.

# 5. Pada percobaan 1, definisikan bagian kode program sesuai prinsip SOLID.
Definisi Percobaan 1 sesuai Prinsip SOLID
- Single Responsibility Principle (SRP)
Pada percobaan 1, kelas Puppy hanya memiliki satu tanggung jawab yaitu merepresentasikan data dan perilaku seekor anak anjing (name, age).
- dalam code:

public void setAge(int age) {
    puppyAge = age;    
}
public int getAge () {
    System.out.println("Puppy's age is :" + puppyAge);
    return puppyAge;      
}
  setAge dan getAge 
-- 
hanya fokus pada satu tanggung jawab mengatur dan mengembalikan umur.
- Open/Closed Principle (OCP)
Kelas harus dapat diperluas tanpa mengubah kode aslinya. Dalam Kelas Puppy belum ada tapiu bisa dikembangkan menjadi subclass lain (misalnya BulldogPuppy) tanpa harus mengubah kode di kelas Puppy.
- Liskov Substitution Principle (LSP)
Subclass harus bisa menggantikan superclass tanpa merusak program. Dalam kelas Puppy Jika dibuat kelas turunan BulldogPuppy, maka ia dapat menggantikan Puppy dan program tetap berjalan dengan baik.

- Interface Segregation Principle (ISP)
Interface sebaiknya dibuat spesifik sesuai kebutuhan, bukan interface besar yang berisi banyak method. Jika Puppy membutuhkan perilaku tambahan seperti play atau train, maka dibuat interface khusus misalnya Playable, bukan dicampur ke dalam satu interface umum.
- Dependency Inversion Principle (DIP)
Program harus bergantung pada abstraksi, bukan pada implementasi konkret. Jika Puppy berhubungan dengan layanan eksternal (misalnya makanan), maka ia sebaiknya bergantung pada interface FoodService, bukan langsung pada kelas implementasi tertentu.

Jadi, pada percobaan 1:
- Kelas Puppy sudah sesuai dengan SRP karena hanya fokus pada data dan perilaku anak anjing.
- Kelas ini juga siap untuk memenuhi OCP dan LSP bila dikembangkan lebih lanjut dengan subclass.
- Prinsip ISP dan DIP bisa diterapkan saat program menjadi lebih kompleks dengan penggunaan interface dan abstraksi tambahan.


# 6. Compile program pada percobaan 2 dan 3 dan lakukan analisa anda.
Analisis percobaan 2 
Terdapat method cetak() yang didefinisikan sebagai static void. 
- void berarti method tidak mengembalikan data, hanya menjalankan perintah (misalnya menampilkan teks).
- static berarti method dapat dipanggil langsung dari main() tanpa membuat objek. 

Hal ini membuktikan bahwa static void method dapat dipanggil tanpa objek dan berfungsi untuk menampilkan perintah, bukan mengembalikan nilai.
Awalnya program tidak berjalan karena kesalahan penulisan main (public void static), namun setelah diperbaiki menjadi public static void main(String[] args), program berhasil dikompilasi dan dijalankan. 

Analisis percobaan 3
Terdapat dua jenis method pada percobaan ini:
- Static Method (myStaticMethod()):  Dapat dipanggil langsung dari main() tanpa membuat objek. Melekat pada class, bukan pada instance.
- Non-Static/Public Method (myPublicMethod()): Tidak bisa dipanggil langsung dari main(). Harus dipanggil melalui objek hasil instansiasi (new Main()).

Hal ini membuktikan bahwa static method digunakan untuk aksi yang tidak bergantung pada objek, sedangkan non-static method harus diakses melalui objek karena terkait dengan instance.Jika method non-static dipanggil langsung di dalam main() tanpa objek, program akan error. Oleh karena itu, dibuat objek Main myObj = new Main(); lalu method dipanggil melalui objek (myObj.myPublicMethod();).

