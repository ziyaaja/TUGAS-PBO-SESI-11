import java.io.*;

public class FileMerge {
    public static void main(String[] args) {
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String mergedFile = "merged.txt";

        try (
            BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile));
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedReader br2 = new BufferedReader(new FileReader(file2))
        ) {
            String line;

            // Baca dan tulis isi file1.txt ke merged.txt
            while ((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            // Baca dan tulis isi file2.txt ke merged.txt
            while ((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("File berhasil digabungkan ke " + mergedFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
