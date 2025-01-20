package org.hidenpro.html.builder.stylesheet;

import lombok.Data;

import java.util.List;

@Data
public class StyleData {
    private SelectorType selectorType;
    private List<StyleElement> styleElements;
}
