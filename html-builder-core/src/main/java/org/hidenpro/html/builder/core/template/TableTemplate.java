package org.hidenpro.html.builder.core.template;

import org.hidenpro.html.builder.model.table.TableData;

public class TableTemplate extends AbstractTemplate<TableData> {
    public TableTemplate(TableData tableData) {
        super("<table class=\"{tableClass}\" id=\"{tableId}\">{tableContent}</table>");
        buildWithData(tableData);
    }

    @Override
    protected void buildWithData(TableData data) {
        replaceTemplateString("{tableClass}", data.getTableClass());
        replaceTemplateString("{tableId}", data.getTableId());

        var content = new StringBuilder();
        for (var row : data.getRows()) {
            content.append(new TableRowTemplate(row).getValue());
        }

        replaceTemplateString("{tableContent}", content.toString());
    }
}
