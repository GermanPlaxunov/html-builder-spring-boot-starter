package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.common.ParagraphData;

public class ParagraphTemplate extends AbstractTemplate<ParagraphData> {

    public ParagraphTemplate(ParagraphData paragraphData) {
        super("<p class=\"{elementClass}\" id=\"{elementId}\">{textContent}</p>", paragraphData);
        buildWithData(paragraphData);
    }

    @Override
    protected void buildWithData(ParagraphData data) {
        replaceTemplateString("{textClass}", data.getClazz());
        replaceTemplateString("{elementId}", data.getId());
        replaceTemplateString("{textContent}", data.getTextContent());
    }
}
