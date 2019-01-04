package alh.inc.jp.trelloapis.service.common;

import alh.inc.jp.trelloapis.infrastructure.common.model.ManagementTaskEntity;
import alh.inc.jp.trelloapis.controller.model.ManagementTaskResponse;
import alh.inc.jp.trelloapis.service.common.model.ManagementTaskDto;

import java.util.ArrayList;
import java.util.List;

/**
 * マネジメントタスクレスポンスを作成するファクトリ
 */
public class ManagementTasksResponseFactory {

    /**
     * マネジメントタスクレスポンスを作成する
     *
     * @param managementTaskEntities マネジメントタスクレスポンスのリスト
     * @return マネジメントタスクレスポンス
     */
    public static ManagementTaskResponse create(List<ManagementTaskEntity> managementTaskEntities) {
        List<ManagementTaskDto> managementTaskDtoList = new ArrayList<>();
        for (ManagementTaskEntity managementTask : managementTaskEntities) {
            ManagementTaskDto managementTaskDto = new ManagementTaskDto(
                    managementTask.getTaskId(), managementTask.getName());
            managementTaskDtoList.add(managementTaskDto);
        }
        return new ManagementTaskResponse(managementTaskDtoList);
    }
}
