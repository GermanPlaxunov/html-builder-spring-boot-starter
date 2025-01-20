package org.hidenpro.html.builder.core.template;

import org.hidenpro.html.builder.model.table.CellData;

public class TableCellTemplate extends AbstractTemplate<CellData> {

    public TableCellTemplate(CellData data) {
        super("<th class=\"{cellClass}\" id=\"{cellId}\">{cellContent}</th>");
        buildWithData(data);
    }

    @Override
    protected void buildWithData(CellData data) {
        replaceTemplateString("{cellClass}", data.getCellClass());
        replaceTemplateString("{cellId}", data.getCellId());
        replaceTemplateString("{cellContent}", data.getCellContent());
    }
}
