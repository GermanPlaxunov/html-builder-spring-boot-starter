package org.hidenpro.html.builder.template;

import org.hidenpro.html.builder.model.table.RowData;

public class TableRowTemplate extends AbstractTemplate<RowData> {

    public TableRowTemplate(RowData rowData) {
        super("<tr class=\"{rowClass}\" id=\"{rowId}\">{rowContent}</tr>");
        buildWithData(rowData);
    }

    @Override
    protected void buildWithData(RowData data) {
        replaceTemplateString("{rowClass}", data.getRowClass());
        replaceTemplateString("{rowId}", data.getRowId());

        var rowContent = new StringBuilder();
        for (var cell : data.getCells()) {
            rowContent.append(new TableCellTemplate(cell).getValue());
        }

        replaceTemplateString("{rowContent}", rowContent.toString());
    }
}
