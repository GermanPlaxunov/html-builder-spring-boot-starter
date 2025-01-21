package org.hidenpro.html.builder.model.html.data.heading;

import lombok.Data;

@Data
public class HeadingData {
    private String headingLevel;
    private String headingContent;
    private String headingClass;
    private String headingId; // todo в абстрактный класс модели
}
