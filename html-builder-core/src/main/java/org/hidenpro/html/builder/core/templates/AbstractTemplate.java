package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.AbstractElementData;

public abstract class AbstractTemplate<T extends AbstractElementData> {

    protected final String ID_TEMPLATE = " id=\"{elementId}\"";
    protected final String CLASS_TEMPLATE = " class=\"{elementClass}\"";
    private String VALUE;

    protected AbstractTemplate(String value, AbstractElementData data) {
        this.VALUE = value;
        eraseIdIfNeeded(data.getId());
        eraseClassIfNeeded(data.getClazz());
    }

    protected abstract void buildWithData(T data);

    protected void eraseIdIfNeeded(String id) {
        if (id == null || id.isEmpty()) {
            this.VALUE = VALUE.replace(ID_TEMPLATE, "");
        }
    }

    protected void eraseClassIfNeeded(String clazz) {
        if (clazz == null || clazz.isEmpty()) {
            this.VALUE = VALUE.replace(CLASS_TEMPLATE, "");
        }
    }

    protected void replaceTemplateString(String template, String replacement) {
        if (template != null && replacement != null) {
            this.VALUE = this.VALUE.replace(template, replacement);
        }
    }

    public String getValue() {
        return this.VALUE;
    }

}
