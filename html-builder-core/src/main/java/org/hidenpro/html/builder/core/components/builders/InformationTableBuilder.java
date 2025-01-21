package org.hidenpro.html.builder.core.components.builders;

import org.hidenpro.html.builder.core.components.InformationTable;
import org.hidenpro.html.builder.core.stylesheet.presets.StyleType;
import org.hidenpro.html.builder.core.templates.HeadingTemplate;
import org.hidenpro.html.builder.core.templates.TableTemplate;
import org.hidenpro.html.builder.model.html.data.heading.HeadingData;
import org.hidenpro.html.builder.model.html.data.table.TableData;

public class InformationTableBuilder {

    public InformationTable build(String tableHeading, TableData tableData) {
        var informTable = new InformationTable();
        checkTableStyle(tableData);
        informTable.setTableTemplate(new TableTemplate(tableData));
        var headingData = new HeadingData();
        headingData.setHeadingContent(tableHeading);
        headingData.setHeadingLevel("3");
        headingData.setHeadingClass("default");
        informTable.setHeadingTemplate(new HeadingTemplate(headingData));
        return informTable;
    }

    private void checkTableStyle(TableData tableData) {
        if (tableData.getTableClass() == null) {
            tableData.setTableClass(StyleType.DEFAULT.name().toLowerCase());
        }
    }

}
