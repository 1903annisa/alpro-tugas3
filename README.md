#output_1
public class jawaban {
    public static void main(String[] args) {
        // Menentukan jumlah baris
        int n = 5;

        // Loop untuk setiap baris
        for (int i = 1; i <= n; i++) {
            // Loop untuk mencetak bintang pada setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Pindah ke baris baru setelah mencetak bintang pada baris ini
            System.out.println();
        }
    }
}
