import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {//toplamını bulmak istediğiniz sayıları number.text ' e satır satır giriniz.

            BufferedReader reader = new BufferedReader(new FileReader("number.txt"));

            String line;
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
            reader.close();

            System.out.println("toplam : " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}