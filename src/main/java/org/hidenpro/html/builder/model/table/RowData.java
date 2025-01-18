package org.hidenpro.html.builder.model.table;

import lombok.Data;

import java.util.List;

@Data
public class RowData {
    private List<CellData> cells;
    private String rowId;
    private String rowClass;
}