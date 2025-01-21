package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.table.RowData;

public class TableRowTemplate extends AbstractTemplate<RowData> {

    public TableRowTemplate(RowData rowData) {
        super("<tr class=\"{rowClass}\" id=\"{elementId}\">{rowContent}</tr>");
        buildWithData(rowData);
    }

    @Override
    protected void buildWithData(RowData data) {
        eraseIdIfNeeded(data.getRowId());
        replaceTemplateString("{rowClass}", data.getRowClass());
        replaceTemplateString("{elementId}", data.getRowId());

        var rowContent = new StringBuilder();
        for (var cell : data.getCells()) {
            rowContent.append(new TableCellTemplate(cell).getValue());
        }

        replaceTemplateString("{rowContent}", rowContent.toString());
    }
}
