package alh.inc.jp.trelloapis.infrastructure.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 共通コンフィグ
 */
@Configuration
public class CommonConfig {

    /**
     * RestTemplateをBean登録する
     *
     * @return
     */
    @Bean
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }
}
