package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.common.HeadingData;

public class HeadingTemplate extends AbstractTemplate<HeadingData> {
    public HeadingTemplate(HeadingData headingData) {
        super("<h{headingLevel} class=\"{elementClass}\" id=\"{elementId}\">{headingContent}</h{headingLevel}>", headingData);
        buildWithData(headingData);
    }

    @Override
    protected void buildWithData(HeadingData data) {
        replaceTemplateString("{elementId}", data.getId());
        replaceTemplateString("{elementClass}", data.getClazz());
        replaceTemplateString("{headingLevel}", data.getHeadingLevel());
        replaceTemplateString("{headingContent}", data.getHeadingContent());
    }
}
