package org.hidenpro.html.builder.model.file;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FileType {

    HTML("html-builder-core/src/main/resources/output/html"),
    STYLESHEET("html-builder-core/src/main/resources/output/css");

    private final String targetDir;

}
