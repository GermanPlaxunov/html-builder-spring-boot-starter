package org.hidenpro.html.builder.core.config;

import org.hidenpro.html.builder.core.page.HtmlPageBuilder;
import org.hidenpro.html.builder.core.writer.FileWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HtmlBuilderBeansConfig {

    @Bean
    public HtmlPageBuilder htmlPageBuilder() {
        return new HtmlPageBuilder();
    }

    @Bean
    public FileWriter pageWriter() {
        return new FileWriter();
    }

}
