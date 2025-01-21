package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.text.TextData;

public class TextTemplate extends AbstractTemplate<TextData> {
    protected TextTemplate(TextData textData) {
        super("<p class=\"{textClass}\" id=\"{elementId}\">{textContent}</p>");
        buildWithData(textData);
    }

    @Override
    protected void buildWithData(TextData data) {
        eraseIdIfNeeded(data.getTextId());
        replaceTemplateString("{textClass}", data.getTextClass());
        replaceTemplateString("{elementId}", data.getTextId());
        replaceTemplateString("{textContent}", data.getTextContent());
    }
}
