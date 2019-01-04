package alh.inc.jp.trelloapis.controller.model;

import alh.inc.jp.trelloapis.service.common.model.ManagementTaskDto;

import java.util.List;

/**
 * マネジメントタスク情報を格納するクラス
 */
public class ManagementTaskResponse {

    private List<ManagementTaskDto> managementTaskDtoList;

    public List<ManagementTaskDto> getManagementTaskDtoList() {
        return managementTaskDtoList;
    }

    /**
     * コンストラクター
     *
     * @param managementTaskDtoList マネジメントタスクDtoのリスト
     */
    public ManagementTaskResponse(List<ManagementTaskDto> managementTaskDtoList) {
        this.managementTaskDtoList = managementTaskDtoList;
    }
}
