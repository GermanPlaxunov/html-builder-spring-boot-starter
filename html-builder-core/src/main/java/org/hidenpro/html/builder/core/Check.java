package org.hidenpro.html.builder.core;

import org.hidenpro.html.builder.core.components.builders.InformationTableBuilder;
import org.hidenpro.html.builder.core.page.HtmlPageBuilder;
import org.hidenpro.html.builder.core.stylesheet.StylesheetLinker;
import org.hidenpro.html.builder.core.templates.TableTemplate;
import org.hidenpro.html.builder.core.writer.FileWriter;
import org.hidenpro.html.builder.model.file.FileType;
import org.hidenpro.html.builder.model.html.data.table.CellData;
import org.hidenpro.html.builder.model.html.data.table.RowData;
import org.hidenpro.html.builder.model.html.data.table.TableData;

import java.util.List;

public class Check {

    public static void main(String[] args) {
        var builder = new HtmlPageBuilder();

        var informTableBuilder = new InformationTableBuilder();
        var table = informTableBuilder.build("Example Table", getTableData());

        var page = builder.createPageWithContent(table.getValue());
        page = new StylesheetLinker().addStyleSheets(page);
        new FileWriter().saveFile(page, FileType.HTML, "file1.html");
    }

    private static TableData getTableData() {
        var cellData1 = new CellData().setCellClass("simpleCellClass").setCellContent("cell1");
        var cellData2 = new CellData().setCellClass("simpleCellClass").setCellContent("cell2");
        var cellData3 = new CellData().setCellClass("simpleCellClass").setCellContent("cell3");
        var cellData4 = new CellData().setCellClass("simpleCellClass").setCellContent("cell4");
        var cells = List.of(cellData1, cellData2, cellData3, cellData4);

        var row1 = new RowData().setRowId("simpleRowId1").setRowClass("simpleRowClass").setCells(cells);
        var row2 = new RowData().setRowId("simpleRowId2").setRowClass("simpleRowClass").setCells(cells);
        var row3 = new RowData().setRowId("simpleRowId3").setRowClass("simpleRowClass").setCells(cells);
        var row4 = new RowData().setRowId("simpleRowId4").setRowClass("simpleRowClass").setCells(cells);
        var rows = List.of(row1, row2, row3, row4);

        return new TableData().setTableId("simpleTableId").setTableClass("simpleTableClass").setRows(rows);
    }

}
