package org.hidenpro.html.builder.model.html.data.table;

import lombok.Data;

import java.util.List;

@Data
public class TableData {
    private List<RowData> rows;
    private String tableClass;
    private String tableId;
}
