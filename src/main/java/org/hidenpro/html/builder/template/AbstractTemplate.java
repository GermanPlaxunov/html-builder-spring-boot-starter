package org.hidenpro.html.builder.template;

public abstract class AbstractTemplate<T> {

    private String VALUE;

    protected AbstractTemplate(String value) {
        this.VALUE = value;
    }

    protected abstract void buildWithData(T data);

    protected void replaceTemplateString(String template, String replacement) {
        if (template != null && replacement != null) {
            this.VALUE = this.VALUE.replace(template, replacement);
        }
    }

    public String getValue() {
        return this.VALUE;
    }

}
