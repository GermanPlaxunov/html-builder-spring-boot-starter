package org.hidenpro.html.builder.core.stylesheet;

import org.hidenpro.html.builder.core.templates.AbstractTemplate;
import org.hidenpro.html.builder.model.style.StyleData;
import org.hidenpro.html.builder.model.style.StyleElement;

import java.util.List;

public class StylesheetTemplate extends AbstractTemplate<StyleData> {

    protected StylesheetTemplate(StyleData styleData) {
        super("{selectorType}{\n{allStyles}\n}");
        buildWithData(styleData);
    }

    @Override
    protected void buildWithData(StyleData data) {
        replaceTemplateString("{selectorType}", data.getSelectorType().getSymbol());
        replaceTemplateString("{allStyles}", getAllStyles(data.getStyleElements()));
    }

    private String getAllStyles(List<StyleElement> styles) {
        var style = new StringBuilder();
        style.append(styles.get(0).getName().concat(": ").concat(styles.get(0).getValue()));
        for (var elem : styles) {
            style.append(",\n")
                    .append(elem.getName()
                            .concat(": ")
                            .concat(elem.getValue()));
        }
        return styles.toString();
    }

}
