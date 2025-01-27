package org.hidenpro.html.builder.core;

import org.hidenpro.html.builder.core.impl.HtmlBuilderApiImpl;
import org.hidenpro.html.builder.core.writer.FileWriter;
import org.hidenpro.html.builder.model.html.data.common.HeadingData;
import org.hidenpro.html.builder.model.html.data.table.CellData;
import org.hidenpro.html.builder.model.html.data.table.RowData;
import org.hidenpro.html.builder.model.html.data.table.TableData;

import java.util.ArrayList;

public class Check {

    public static void main(String[] args) {
        var api = new HtmlBuilderApiImpl(new FileWriter());

        var heading = new HeadingData();
        heading.setHeadingLevel("2")
                .setHeadingContent("heading1")
                .setId("headingId")
                .setClazz("headingClazz")
                .setFileName("check1.html");
        api.addHeading(heading);

        var table = new TableData();
        table.setRows(new ArrayList<>());
        table.getRows().add(new RowData().setCells(new ArrayList<>()));
        table.getRows().get(0).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId11").setClazz("cellClass"));
        table.getRows().get(0).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId12").setClazz("cellClass"));
        table.getRows().get(0).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId13").setClazz("cellClass"));
        table.getRows().get(0).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId14").setClazz("cellClass"));
        table.getRows().add(new RowData().setCells(new ArrayList<>()));
        table.getRows().get(1).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId21").setClazz("cellClass"));
        table.getRows().get(1).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId22").setClazz("cellClass"));
        table.getRows().get(1).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId23").setClazz("cellClass"));
        table.getRows().get(1).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId24").setClazz("cellClass"));
        table.getRows().add(new RowData().setCells(new ArrayList<>()));
        table.getRows().get(2).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId31").setClazz("cellClass"));
        table.getRows().get(2).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId32").setClazz("cellClass"));
        table.getRows().get(2).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId33").setClazz("cellClass"));
        table.getRows().get(2).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId34").setClazz("cellClass"));
        table.getRows().add(new RowData().setCells(new ArrayList<>()));
        table.getRows().get(3).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId41").setClazz("cellClass"));
        table.getRows().get(3).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId42").setClazz("cellClass"));
        table.getRows().get(3).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId43").setClazz("cellClass"));
        table.getRows().get(3).getCells().add((CellData) new CellData().setCellContent("cell").setId("cellId44").setClazz("cellClass"));
        table.setFileName("check1.html")
                .setClazz("tableClass")
                .setId("tableId");
        api.addTable(table);
    }

}
