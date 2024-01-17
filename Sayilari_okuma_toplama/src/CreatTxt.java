import java.io.*;
import java.nio.charset.Charset;

public class CreatTxt {
    private int a=5;
    private int b=10;
    private int c=20;
    private int d=12;
    private int e=33;

    public CreatTxt(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    public CreatTxt(){

    }
    public void FileCreat(){//dosya oluşturma işlemi
        // Dosya oluşturma
        File numbers = new File("sayılar.txt");
        // Dosyanın var olup olmadığını kontrol etme
        if (numbers.exists()) {
            System.out.println("Dosya mevcut.");
        }
        else {
            System.out.println("Dosya mevcut değil.");
        }
    }
    public void Write(){//dosyaya yazma işlemi
        try {
            FileWriter writer=new FileWriter("sayılar.txt",Charset.forName("UTF-8"),true);
            BufferedWriter num=new BufferedWriter(writer);
            writer.write(this.a);
            System.lineSeparator();
            writer.write(this.b);
            System.lineSeparator();
            writer.write(this.c);
            System.lineSeparator();
            writer.write(this.d);
            System.lineSeparator();
            writer.write(this.e);
            System.lineSeparator();
            writer.close();

        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
    public void Read(){
        try {
            FileReader file = new FileReader("sayılar.txt", Charset.forName("UTF-8"));
            BufferedReader input = new BufferedReader(file);

            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }

            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }
}

