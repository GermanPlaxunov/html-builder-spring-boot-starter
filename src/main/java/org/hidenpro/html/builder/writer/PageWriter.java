package org.hidenpro.html.builder.writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PageWriter {
    public void save(String report) {
        String fileName = "file.html";
        Path resourceDirectory = Paths.get("src/main/resources");
        Path filePath = resourceDirectory.resolve(fileName);

        try {
            Files.writeString(filePath, report);
            System.out.println("File written successfully at: " + filePath.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
