package org.hidenpro.html.builder.core.writer;

import lombok.extern.slf4j.Slf4j;
import org.hidenpro.html.builder.model.file.FileType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class FileWriter {

    public void saveFile(String content, FileType type, String fileName) {
        Path resourceDirectory = Paths.get(type.getTargetDir());
        Path filePath = resourceDirectory.resolve(fileName);

        try {
            Files.writeString(filePath, content);
            log.info("File written successfully at: {}", filePath);
        } catch (IOException e) {
            log.error("Ошибка записи в файл: {}", e.getLocalizedMessage());
        }
    }

}
