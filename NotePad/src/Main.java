import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CreatFile(Word());
        System.out.println();
        ReadFile();

    }
    public static String Word(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String word = scanner.nextLine();
        return word;
    }
    public static void CreatFile(String word){
        try {
            FileWriter fileWriter=new FileWriter("notepad.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(word);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void ReadFile(){
        try {
            FileReader fileReader=new FileReader("notepad.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            Scanner scanner=new Scanner(bufferedReader);
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                System.out.println("son girdiğiniz metin : "+line);
            }
            scanner.close();

            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }

    }
}