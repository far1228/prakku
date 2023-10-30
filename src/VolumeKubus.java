import java.util.Scanner;

/**
 * Kelas VolumeKubus digunakan untuk menghitung volume kubus yang diinputkan user.
 * Program ini menerima input sisi kubus dari user dan menghitung volume kubus.
 */
public class VolumeKubus{
    private double sisi;
    private double hasil;

    /**
     * Metode program ini digunakan untuk menghitung volume kubus.
     * @param args Argumen pada baris perintah tidak digunakan pada program ini;
     */

    public static void main(String[] args) {
        System.out.println("==Program perhitungan volume kubus==");
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan sisi kubus : ");
        double sisi = input.nextDouble();
        double hasil = sisi*sisi*sisi;

        System.out.println("Hasil volume kubus dengan sisi " + sisi + " adalah = " + hasil);
    }
}
