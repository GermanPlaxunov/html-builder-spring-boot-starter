package org.hidenpro.html.builder.page;

public class HtmlPageBuilder {

    private StringBuilder page;

    public String createPageWithContent(String pageContent) {
        initPage();
        page.append(pageContent);
        closePage();
        return page.toString();
    }

    private void initPage() {
        page = new StringBuilder("""
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>{pageTitle}</title>
                    {linkAllStylesheetFiles}
                </head>
                <body>
                """);
    }

    private void closePage() {
        page.append("""
                </body>
                </html>
                """);
    }

}
