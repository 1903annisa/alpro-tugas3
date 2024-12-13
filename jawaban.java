#output_2
public class jawaban {
    public static void main(String[] args) {
        // Menentukan jumlah baris
        int n = 5;

        // Loop untuk setiap baris
        for (int i = 1; i <= n; i++) {
            // Loop untuk mencetak angka pada setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Pindah ke baris baru setelah mencetak angka pada baris ini
            System.out.println();
        }
    }
}
