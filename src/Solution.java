import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> lines = new HashSet<>();
        String dat = ".dat";
        String file_path = "E:/Danila/files_copy/full_after_cleaning"; // вставить название исходного файла
        File input_file = new File(file_path + dat); // входной файл
        File output_file = new File(file_path + "_bez_dublerov" + dat); // получаемый файл
        try(BufferedReader reader = new BufferedReader(new FileReader(input_file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(output_file))) {
            while (reader.ready()) {
                lines.add(reader.readLine());
            }
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
