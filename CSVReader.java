import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        String line;
        String csvSplitBy = ",";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                System.out.println("NIM: " + data[0] + ", NAMA: " + data[1] + ", UMUR: " + data[2] + ", PRODI: " + data[3]);
                count++;
            }
            System.out.println("Jumlah baris dalam file: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
