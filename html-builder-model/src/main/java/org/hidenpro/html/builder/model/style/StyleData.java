package org.hidenpro.html.builder.model.style;

import lombok.Data;

import java.util.List;

@Data
public class StyleData {
    private SelectorType selectorType;
    private List<StyleElement> styleElements;
}
