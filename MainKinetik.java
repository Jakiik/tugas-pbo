/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W4;


import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Bagus Dzakiy Rahman Saputra
 * NIM: 22104410033
 */

public class MainKinetik {
    public double massa;
    public double kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double hitungMomentum() {
        return massa * kecepatan;
    }

    public double hitungEnergiKinetik() {
        double kecepatanKuadrat = Math.pow(kecepatan, 2);
        double energiKinetik = 0.5 * massa * kecepatanKuadrat;
        return energiKinetik;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MainKinetik objek = new MainKinetik();

        System.out.print("Masukkan massa objek: ");
        double massa = scanner.nextDouble();
        objek.setMassa(massa);

        System.out.print("Masukkan kecepatan objek: ");
        double kecepatan = scanner.nextDouble();
        objek.setKecepatan(kecepatan);

        double momentum = objek.hitungMomentum();
        double energiKinetik = objek.hitungEnergiKinetik();

        System.out.println("Momentum: " + momentum);
        System.out.println("Energi Kinetik: " + energiKinetik);
        
    }
}