package org.hidenpro.html.builder.core.writer;

import lombok.extern.slf4j.Slf4j;
import org.hidenpro.html.builder.model.file.FileType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Класс для записи в файл.
 */
@Slf4j
public class FileWriter {

    /**
     * Дописывает в конец указанного файла. Если файла нет - создает новый с указанным именем.
     *
     * @param content  - строка для записи
     * @param type     - тип файла
     * @param fileName - имя файла
     */
    public void saveFile(String content, FileType type, String fileName) {
        Path resourceDirectory = Paths.get(type.getTargetDir());
        Path filePath = resourceDirectory.resolve(fileName);

        createFileIfNeeded(filePath);

        try {
            Files.writeString(filePath, content, StandardOpenOption.APPEND);
            log.info("File written successfully at: {}", filePath);
        } catch (IOException e) {
            log.error("Ошибка записи в файл: ", e);
        }
    }

    private void createFileIfNeeded(Path path) {
        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
