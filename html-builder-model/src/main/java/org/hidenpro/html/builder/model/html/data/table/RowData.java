package org.hidenpro.html.builder.model.html.data.table;

import lombok.Data;
import org.hidenpro.html.builder.model.html.data.AbstractElementData;

import java.util.List;

@Data
public class RowData extends AbstractElementData {
    private List<CellData> cells;
}