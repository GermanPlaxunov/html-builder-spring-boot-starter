package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.table.TableData;

public class TableTemplate extends AbstractTemplate<TableData> {

    private static final String templateString = "<table class=\"{tableClass}\" id=\"{elementId}\">{tableContent}</table>";

    public TableTemplate(TableData tableData) {
        super(templateString, tableData);
        buildWithData(tableData);
    }

    @Override
    protected void buildWithData(TableData data) {
        replaceTemplateString("{tableClass}", data.getClazz());
        replaceTemplateString("{elementId}", data.getId());

        var content = new StringBuilder();
        for (var row : data.getRows()) {
            content.append(new TableRowTemplate(row).getValue());
        }

        replaceTemplateString("{tableContent}", content.toString());
    }
}
