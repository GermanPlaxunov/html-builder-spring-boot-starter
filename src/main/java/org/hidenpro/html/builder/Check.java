package org.hidenpro.html.builder;

import org.hidenpro.html.builder.model.table.CellData;
import org.hidenpro.html.builder.model.table.RowData;
import org.hidenpro.html.builder.model.table.TableData;
import org.hidenpro.html.builder.page.HtmlPageBuilder;
import org.hidenpro.html.builder.stylesheet.StylesheetLinker;
import org.hidenpro.html.builder.template.TableTemplate;
import org.hidenpro.html.builder.writer.PageWriter;

import java.util.List;

public class Check {

    public static void main(String[] args) {
        var builder = new HtmlPageBuilder();

        var table = new TableTemplate(getTableData());

        var page = builder.createPageWithContent(table.getValue());
        page = new StylesheetLinker().addStyleSheets(page);
        new PageWriter().save(page);
    }

    private static TableData getTableData() {
        var cellData1 = new CellData().setCellId("simpleCellId1").setCellClass("simpleCellClass").setCellContent("cell1");
        var cellData2 = new CellData().setCellId("simpleCellId2").setCellClass("simpleCellClass").setCellContent("cell2");
        var cellData3 = new CellData().setCellId("simpleCellId3").setCellClass("simpleCellClass").setCellContent("cell3");
        var cellData4 = new CellData().setCellId("simpleCellId4").setCellClass("simpleCellClass").setCellContent("cell4");
        var cells = List.of(cellData1, cellData2, cellData3, cellData4);

        var row1 = new RowData().setRowId("simpleRowId1").setRowClass("simpleRowClass").setCells(cells);
        var row2 = new RowData().setRowId("simpleRowId2").setRowClass("simpleRowClass").setCells(cells);
        var row3 = new RowData().setRowId("simpleRowId3").setRowClass("simpleRowClass").setCells(cells);
        var row4 = new RowData().setRowId("simpleRowId4").setRowClass("simpleRowClass").setCells(cells);
        var rows = List.of(row1, row2, row3, row4);

        return new TableData().setTableId("simpleTableId").setTableClass("simpleTableClass").setRows(rows);
    }

}
