package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.table.CellData;

public class TableCellTemplate extends AbstractTemplate<CellData> {

    private static final String templateString = "<th class=\"{cellClass}\" id=\"{elementId}\">{cellContent}</th>";

    public TableCellTemplate(CellData data) {
        super(templateString, data);
        buildWithData(data);
    }

    @Override
    protected void buildWithData(CellData data) {
        replaceTemplateString("{cellClass}", data.getClazz());
        replaceTemplateString("{elementId}", data.getId());
        replaceTemplateString("{cellContent}", data.getCellContent());
    }
}
