package org.hidenpro.html.builder.stylesheet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SelectorType {

    BY_ID("#"),
    BY_CLASS(".");

    private final String symbol;

}
