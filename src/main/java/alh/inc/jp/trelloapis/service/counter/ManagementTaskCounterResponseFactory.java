package alh.inc.jp.trelloapis.service.counter;

import alh.inc.jp.trelloapis.controller.model.ManagementTaskCounterResponse;
import alh.inc.jp.trelloapis.infrastructure.counter.model.ManagementTaskCounterEntity;
import alh.inc.jp.trelloapis.service.counter.model.ManagementTaskCounterDto;

import java.util.ArrayList;
import java.util.List;

/**
 * マネジメントタスクカウンターレスポンスを作成するファクトリ
 */
public class ManagementTaskCounterResponseFactory {

    /**
     * マネジメントタスクカウンターレスポンスを作成する
     *
     * @param managementTaskCounterEntities マネジメントタスクカウンターエンティティのリスト
     * @return マネジメントタスクカウンターレスポンス
     */
    public static ManagementTaskCounterResponse create(
            List<ManagementTaskCounterEntity> managementTaskCounterEntities) {
        List<ManagementTaskCounterDto> managementTaskCounterDtoList = new ArrayList<>();
        for(ManagementTaskCounterEntity managementTaskCounter : managementTaskCounterEntities) {
            ManagementTaskCounterDto managementTaskCounterDto = new ManagementTaskCounterDto(
                    managementTaskCounter.getTaskId(),
                    managementTaskCounter.getEmployeeNo(),
                    managementTaskCounter.getExecutionCount(),
                    managementTaskCounter.getPassesCount());
            managementTaskCounterDtoList.add(managementTaskCounterDto);
        }
        return new ManagementTaskCounterResponse(managementTaskCounterDtoList);
    }
}
