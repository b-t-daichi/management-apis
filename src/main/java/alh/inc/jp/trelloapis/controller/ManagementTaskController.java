package alh.inc.jp.trelloapis.controller;

import alh.inc.jp.trelloapis.service.common.ManagementTaskService;
import alh.inc.jp.trelloapis.controller.model.ManagementTaskResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * マネジメントタスクを扱うコントローラー
 */
@RestController
public class ManagementTaskController {

    private final ManagementTaskService managementTaskService;

    /**
     * コンストラクター
     *
     * @param managementTaskService マネジメントタスクサービス
     */
    public ManagementTaskController(ManagementTaskService managementTaskService) {
        this.managementTaskService = managementTaskService;
    }

    /**
     * マネジメントタスクの一覧を返却する
     *
     * @return マネジメントタスクの一覧
     */
    @GetMapping(value = "/v1/management/tasks")
    public ResponseEntity<ManagementTaskResponse> loadManagementTasks() {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=utf-8");
            HttpStatus status = HttpStatus.OK;
            return new ResponseEntity<>(
                    managementTaskService.loadManagementTasks(), headers, status);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
