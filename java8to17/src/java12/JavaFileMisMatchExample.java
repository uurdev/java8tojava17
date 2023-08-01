package java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author ugur.ciftci
 * @since 1.08.2023
 */
public class JavaFileMisMatchExample {
    /*
    İki dosyayı karşılaştırmak için mismatch metodu eklenmiştir.
    uyuşmazlık yoksa -1
    varsa uyuşmazlığın olduğu yeri işaret eder
     */
    public static void main(String[] args) throws IOException {
        Path filePath1 = Files.createTempFile("uur", ".txt");
        Path filePath2 = Files.createTempFile("dev", ".txt");
        Files.writeString(filePath1, "Smartera Java Versiyon Sunumu");
        Files.writeString(filePath2, "Smartera Java Versiyon Sunumu");

        long mismatch = Files.mismatch(filePath1, filePath2);
        System.out.println(mismatch);

        filePath1.toFile().deleteOnExit();
        filePath2.toFile().deleteOnExit();
    }
}
