package by.it.liukhtenko.training.crypto;


import javax.crypto.Cipher;
/**
 * Created by administrator on 16.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        Aes256Class aes256 = new Aes256Class();
        String mes1 = "[B@45c7dec8";
        String mes = "семнадцать";
        for (int i = 0; i < 3; i++) {
            byte[] shifr = aes256.makeAes(mes.getBytes(), Cipher.ENCRYPT_MODE);
            System.out.println(new String(shifr));
            Aes256Class aes256_new = new Aes256Class();
            byte[] src = aes256_new.makeAes(shifr, Cipher.DECRYPT_MODE);
            System.out.println(new String(src));
        }
    }
}