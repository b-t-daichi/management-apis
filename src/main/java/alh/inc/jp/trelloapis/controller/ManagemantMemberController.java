package alh.inc.jp.trelloapis.controller;

import alh.inc.jp.trelloapis.controller.model.ManagementMemberResponse;
import alh.inc.jp.trelloapis.service.common.ManagementMemberService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * マネジメントメンバーを扱うコントローラー
 */
@RestController
public class ManagemantMemberController {

    private final ManagementMemberService managementMemberService;

    public ManagemantMemberController (ManagementMemberService managementMemberService) {
        this.managementMemberService = managementMemberService;
    }

    @GetMapping(value = "/")
    public String get() {
        return "Hello";
    }


    /**
     * マネジメントメンバーの一覧を返却する
     *
     * @return マネジメントメンバーの一覧
     */
    @GetMapping(value = "/v1/management/members")
    public ResponseEntity<ManagementMemberResponse> loadManagementMembers() {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=utf-8");
            HttpStatus status = HttpStatus.OK;
            return new ResponseEntity<>(
                    managementMemberService.loadManagementMemberList(), headers, status);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
