package org.hidenpro.html.builder.config;

import org.hidenpro.html.builder.page.HtmlPageBuilder;
import org.hidenpro.html.builder.writer.PageWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HtmlBuilderBeansConfig {

    @Bean
    public HtmlPageBuilder htmlPageBuilder() {
        return new HtmlPageBuilder();
    }

    @Bean
    public PageWriter pageWriter() {
        return new PageWriter();
    }

}
