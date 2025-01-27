package org.hidenpro.html.builder.core.impl;

import lombok.RequiredArgsConstructor;
import org.hidenpro.html.builder.core.HtmlBuilderApi;
import org.hidenpro.html.builder.core.templates.HeadingTemplate;
import org.hidenpro.html.builder.core.templates.LineBreakTemplate;
import org.hidenpro.html.builder.core.templates.ParagraphTemplate;
import org.hidenpro.html.builder.core.templates.TableTemplate;
import org.hidenpro.html.builder.core.writer.FileWriter;
import org.hidenpro.html.builder.model.file.FileType;
import org.hidenpro.html.builder.model.html.data.common.HeadingData;
import org.hidenpro.html.builder.model.html.data.common.LineBreakData;
import org.hidenpro.html.builder.model.html.data.common.ParagraphData;
import org.hidenpro.html.builder.model.html.data.table.TableData;

@RequiredArgsConstructor
public class HtmlBuilderApiImpl implements HtmlBuilderApi {

    /**
     * Класс для записи в файл.
     */
    private final FileWriter fileWriter;

    @Override
    public void addHeading(HeadingData headingData) {
        var heading = new HeadingTemplate(headingData);
        fileWriter.saveFile(heading.getValue(), FileType.HTML, headingData.getFileName());
    }

    @Override
    public void addTable(TableData tableData) {
        var table = new TableTemplate(tableData);
        fileWriter.saveFile(table.getValue(), FileType.HTML, tableData.getFileName());
    }

    @Override
    public void addLineBreak(LineBreakData lineBreakData) {
        var lineBreak = new LineBreakTemplate(lineBreakData);
        fileWriter.saveFile(lineBreak.getValue(), FileType.HTML, lineBreakData.getFileName());
    }

    @Override
    public void addParagraph(ParagraphData paragraphData) {
        var paragraph = new ParagraphTemplate(paragraphData);
        fileWriter.saveFile(paragraph.getValue(), FileType.HTML, paragraphData.getFileName());
    }

}
