package org.hidenpro.html.builder.core.templates;

import org.hidenpro.html.builder.model.html.data.AbstractElementData;
import org.hidenpro.html.builder.model.html.data.PageData;

public class PageTemplate extends AbstractTemplate<PageData> {

    protected PageTemplate(AbstractElementData data) {
        super("", data);
    }

    @Override
    protected void buildWithData(PageData data) {

    }
}
