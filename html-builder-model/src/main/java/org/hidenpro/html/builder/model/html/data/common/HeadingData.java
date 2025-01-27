package org.hidenpro.html.builder.model.html.data.common;

import lombok.Data;
import org.hidenpro.html.builder.model.html.data.AbstractElementData;

@Data
public class HeadingData extends AbstractElementData {
    private String headingLevel;
    private String headingContent;
}
