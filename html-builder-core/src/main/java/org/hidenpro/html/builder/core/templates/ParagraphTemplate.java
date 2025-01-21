package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.paragraph.ParagraphData;

public class ParagraphTemplate extends AbstractTemplate<ParagraphData> {

    public ParagraphTemplate(ParagraphData paragraphData) {
        super("<p class=\"{textClass}\" id=\"{elementId}\">{textContent}</p>");
        buildWithData(paragraphData);
    }

    @Override
    protected void buildWithData(ParagraphData data) {
        eraseIdIfNeeded(data.getTextId());
        replaceTemplateString("{textClass}", data.getTextClass());
        replaceTemplateString("{elementId}", data.getTextId());
        replaceTemplateString("{textContent}", data.getTextContent());
    }
}
