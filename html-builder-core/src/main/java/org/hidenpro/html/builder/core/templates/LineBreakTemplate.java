package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.common.LineBreakData;

/**
 * Шаблон переноса строки.
 */
public class LineBreakTemplate extends AbstractTemplate<LineBreakData> {

    private static final String templateString = "<br class=\"{elementClass}\" id=\"{elementId}\"></br>";

    public LineBreakTemplate(LineBreakData data) {
        super(templateString, data);
        buildWithData(data);
    }

    @Override
    protected void buildWithData(LineBreakData data) {
        replaceTemplateString("{elementClass}", data.getClazz());
        replaceTemplateString("{elementId}", data.getId());
    }
}
