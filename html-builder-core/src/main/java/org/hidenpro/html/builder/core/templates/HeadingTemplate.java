package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.heading.HeadingData;

public class HeadingTemplate extends AbstractTemplate<HeadingData>{
    public HeadingTemplate(HeadingData headingData) {
        super("<h{headingLevel} class=\"{headingClass}\" id=\"{elementId}\">{headingContent}</h{headingLevel}>");
        buildWithData(headingData);
    }

    @Override
    protected void buildWithData(HeadingData data) {
        eraseIdIfNeeded(data.getHeadingId());
        replaceTemplateString("{headingLevel}", data.getHeadingLevel());
        replaceTemplateString("{headingClass}", data.getHeadingClass());
        replaceTemplateString("{elementId}", data.getHeadingId());
        replaceTemplateString("{headingContent}", data.getHeadingContent());
    }
}
