package org.hidenpro.html.builder.stylesheet;

public class StylesheetLinker {

    private final String STYLE = "<link rel=\"stylesheet\" href=\"style/table/simpleTable.css\">";

    public String addStyleSheets(String page) {
        return page.replace("{linkAllStylesheetFiles}", STYLE);
    }

}
