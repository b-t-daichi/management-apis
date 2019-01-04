package alh.inc.jp.trelloapis.service.counter;

import alh.inc.jp.trelloapis.controller.model.ManagementTaskCounterUpdateRequest;
import alh.inc.jp.trelloapis.infrastructure.counter.model.ManagementTaskCounterEntity;
import alh.inc.jp.trelloapis.infrastructure.counter.model.ManagementTaskCounterId;

import java.time.LocalDateTime;

/**
 * マネジメントタスクカウンターエンティティを作成するファクトリ
 */
public class ManagementTaskCounterEntityFactory {

    /**
     * マネジメントタスクカウンターエンティティを作成する
     *
     * @param managementTaskCounterUpdateRequest マネジメントタスクカウンター情報
     * @return マネジメントタスクカウンターエンティティ
     */
    public static ManagementTaskCounterEntity create(
            ManagementTaskCounterUpdateRequest managementTaskCounterUpdateRequest) {
        return new ManagementTaskCounterEntity(
                managementTaskCounterUpdateRequest.getTaskId(),
                managementTaskCounterUpdateRequest.getEmployeeNo(),
                managementTaskCounterUpdateRequest.getExecutionCount(),
                managementTaskCounterUpdateRequest.getPassesCount(),
                LocalDateTime.now());
    }
}
