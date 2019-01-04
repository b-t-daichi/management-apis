package alh.inc.jp.trelloapis.controller;

import alh.inc.jp.trelloapis.controller.model.ManagementTaskCounterUpdateRequest;
import alh.inc.jp.trelloapis.controller.model.ManagementTaskCounterResponse;
import alh.inc.jp.trelloapis.service.counter.ManagementTaskCounterService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * マネジメントタスクカウンターを扱うコントローラー
 */
@RestController
public class ManagementTaskCounterController {

    private final ManagementTaskCounterService managementTaskCounterService;

    public ManagementTaskCounterController(ManagementTaskCounterService managementTaskCounterService) {
        this.managementTaskCounterService = managementTaskCounterService;
    }

    /**
     * タスクIDに紐づく各メンバーのカウント情報を返却する
     *
     * @param taskId タスクID
     * @return タスクID毎の各メンバーの実施回数
     */
    @GetMapping(value = "/v1/management/task-counter")
    public ResponseEntity<ManagementTaskCounterResponse> loadManagementTaskCounter(@RequestParam(value = "taskId") String taskId) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=utf-8");
            HttpStatus status = HttpStatus.OK;
            return new ResponseEntity<>(
                    managementTaskCounterService.loadManagementTaskCounter(taskId), headers, status);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * マネジメントタスクカウンターを更新する
     *
     * @param request マネジメントタスクカウンターリクエスト
     */
    @PostMapping(value = "/v1/management/task-counter")
    public void updateManagementTaskCounter(@ModelAttribute @Valid ManagementTaskCounterUpdateRequest request) {
        managementTaskCounterService.updateManagementTaskCounter(request);
    }
}
