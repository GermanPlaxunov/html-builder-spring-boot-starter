package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.table.TableData;

public class TableTemplate extends AbstractTemplate<TableData> {
    public TableTemplate(TableData tableData) {
        super("<table class=\"{tableClass}\" id=\"{elementId}\">{tableContent}</table>");
        buildWithData(tableData);
    }

    @Override
    protected void buildWithData(TableData data) {
        eraseIdIfNeeded(data.getTableId());
        replaceTemplateString("{tableClass}", data.getTableClass());
        replaceTemplateString("{elementId}", data.getTableId());

        var content = new StringBuilder();
        for (var row : data.getRows()) {
            content.append(new TableRowTemplate(row).getValue());
        }

        replaceTemplateString("{tableContent}", content.toString());
    }
}
