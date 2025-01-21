package org.hidenpro.html.builder.core.components;

import lombok.Data;
import org.hidenpro.html.builder.core.stylesheet.presets.StyleType;
import org.hidenpro.html.builder.core.templates.HeadingTemplate;
import org.hidenpro.html.builder.core.templates.TableTemplate;

/**
 * Шаблон таблицы с информацией. Содержит заголовок и саму таблицу.
 */
@Data
public class InformationTable {
    private HeadingTemplate headingTemplate;
    private TableTemplate tableTemplate;
    private StyleType tableStyleType;
    private StyleType headingStyleType;

    public String getValue() {
        return headingTemplate.getValue().concat("\n").concat(tableTemplate.getValue());
    }

}
