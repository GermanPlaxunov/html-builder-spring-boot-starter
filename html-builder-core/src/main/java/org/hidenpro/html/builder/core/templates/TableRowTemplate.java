package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.table.RowData;

public class TableRowTemplate extends AbstractTemplate<RowData> {

    private static final String templateString = "<tr class=\"{rowClass}\" id=\"{elementId}\">{rowContent}</tr>";

    public TableRowTemplate(RowData rowData) {
        super(templateString, rowData);
        buildWithData(rowData);
    }

    @Override
    protected void buildWithData(RowData data) {
        replaceTemplateString("{rowClass}", data.getClazz());
        replaceTemplateString("{elementId}", data.getId());

        var rowContent = new StringBuilder();
        for (var cell : data.getCells()) {
            rowContent.append(new TableCellTemplate(cell).getValue());
        }

        replaceTemplateString("{rowContent}", rowContent.toString());
    }
}
