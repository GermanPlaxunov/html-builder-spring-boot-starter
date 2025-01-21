package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.table.CellData;

public class TableCellTemplate extends AbstractTemplate<CellData> {

    public TableCellTemplate(CellData data) {
        super("<th class=\"{cellClass}\" id=\"{elementId}\">{cellContent}</th>");
        buildWithData(data);
    }

    @Override
    protected void buildWithData(CellData data) {
        eraseIdIfNeeded(data.getCellId());
        replaceTemplateString("{cellClass}", data.getCellClass());
        replaceTemplateString("{elementId}", data.getCellId());
        replaceTemplateString("{cellContent}", data.getCellContent());
    }
}
