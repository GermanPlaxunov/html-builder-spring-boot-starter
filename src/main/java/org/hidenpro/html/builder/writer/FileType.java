package org.hidenpro.html.builder.writer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FileType {

    HTML("src/main/resources/generated/html"),
    STYLESHEET("src/main/resources/generated/css");

    private final String targetDir;

}
