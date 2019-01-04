package alh.inc.jp.trelloapis.infrastructure.common;

import alh.inc.jp.trelloapis.infrastructure.common.model.MiddleMember;
import alh.inc.jp.trelloapis.infrastructure.common.model.MiddleMemberResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class MiddleMemberApiClient {

    @Value("${trello.member.hostname}")
    private String hostName;

    @Value("${trello.key}")
    private String key;

    @Value("${trello.token}")
    private String token;

    private final RestTemplate restTemplate;

    public MiddleMemberApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public MiddleMemberResponse loadMiddleMemberList() {
        String url = hostName + "?" + key + "&" + token + "&fields=name";
        List<MiddleMember> list = null;
        try {
            list = Arrays.asList(restTemplate.getForObject(url, MiddleMember[].class));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new MiddleMemberResponse(list);
    }

}
