package org.hidenpro.html.builder.core;

import org.hidenpro.html.builder.model.html.data.common.HeadingData;
import org.hidenpro.html.builder.model.html.data.common.LineBreakData;
import org.hidenpro.html.builder.model.html.data.common.ParagraphData;
import org.hidenpro.html.builder.model.html.data.table.TableData;

/**
 * API для билдера HTML страницы.
 * В результате работы должен формироваться конечный HTML документ.
 * Для построения нужно последовательно вызывать методы для добавления
 * элементов страницы.
 */
public interface HtmlBuilderApi {

    /**
     * Дописывает заголовок.
     *
     * @param headingData - данные для заголовка.
     */
    void addHeading(HeadingData headingData);

    /**
     * Дописывает таблицу в страницу.
     *
     * @param tableData - данные для таблицы.
     */
    void addTable(TableData tableData);

    /**
     * Дописывает перенос строки.
     *
     * @param lineBreakData - данные для переноса
     */
    void addLineBreak(LineBreakData lineBreakData);

    /**
     * Дописывает параграф.
     *
     * @param paragraphData - данные для параграфа.
     */
    void addParagraph(ParagraphData paragraphData);

}
