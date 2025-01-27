package org.hidenpro.html.builder.core.config;

import org.hidenpro.html.builder.core.HtmlBuilderApi;
import org.hidenpro.html.builder.core.impl.HtmlBuilderApiImpl;
import org.hidenpro.html.builder.core.writer.FileWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HtmlBuilderBeansConfig {

    @Bean
    public FileWriter pageWriter() {
        return new FileWriter();
    }

    @Bean
    public HtmlBuilderApi htmlBuilderApi(FileWriter fileWriter) {
        return new HtmlBuilderApiImpl(fileWriter);
    }

}
