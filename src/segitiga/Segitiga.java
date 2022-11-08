package segitiga;

import java.util.Scanner;

public class Segitiga {

    public static void main(String[] args) {
                double alas,tinggi,miring,luas,keliling;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Menentukan luas dan keliling segitiga siku-siku");
        System.out.println("Masukan alas =");
        alas = input.nextDouble();
        System.out.println ("Masukan tinggi");
        tinggi = input.nextDouble();
        miring = Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
        System.out.println ("Hasil sisi miring = " + miring);
        luas = 0.5*alas*tinggi;
        System.out.println("Hasil luas = " + luas);
        keliling = alas+tinggi+miring;
        System.out.println("Hasil keliling = " + keliling);
    }
    
}
