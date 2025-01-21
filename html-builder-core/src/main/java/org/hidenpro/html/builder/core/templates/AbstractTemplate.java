package org.hidenpro.html.builder.core.templates;

public abstract class AbstractTemplate<T> {

    protected final String ID_TEMPLATE = " id=\"{elementId}\"";
    private String VALUE;

    protected AbstractTemplate(String value) {
        this.VALUE = value;
    }

    protected abstract void buildWithData(T data);

    protected void eraseIdIfNeeded(String id) {
        if (id == null || id.isEmpty()) {
            this.VALUE = VALUE.replace(ID_TEMPLATE, "");
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
