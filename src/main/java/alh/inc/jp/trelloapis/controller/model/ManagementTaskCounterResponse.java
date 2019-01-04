package alh.inc.jp.trelloapis.controller.model;

import alh.inc.jp.trelloapis.service.counter.model.ManagementTaskCounterDto;

import java.util.List;

/**
 * マネジメントタスクカウンター情報を格納するクラス
 */
public class ManagementTaskCounterResponse {

    private List<ManagementTaskCounterDto> managementTaskCounterDtoList;

    public List<ManagementTaskCounterDto> getManagementTaskCounterDtoList() {
        return managementTaskCounterDtoList;
    }

    /**
     * コンストラクター
     *
     * @param managementTaskCounterDtoList マネジメントタスクカウンターDtoのリスト
     */
    public ManagementTaskCounterResponse(List<ManagementTaskCounterDto> managementTaskCounterDtoList) {
        this.managementTaskCounterDtoList = managementTaskCounterDtoList;
    }
}
