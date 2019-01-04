package alh.inc.jp.trelloapis.service.common;

import alh.inc.jp.trelloapis.infrastructure.common.ManagementTaskRepository;
import alh.inc.jp.trelloapis.infrastructure.common.model.ManagementTaskEntity;
import alh.inc.jp.trelloapis.controller.model.ManagementTaskResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * マネジメントタスクを扱うサービス
 */
@Service
public class ManagementTaskService {

    private final ManagementTaskRepository managementTaskRepository;

    /**
     * コンストラクター
     *
     * @param managementTaskRepository マネジメントタスクリポジトリ
     */
    public ManagementTaskService(ManagementTaskRepository managementTaskRepository) {
        this.managementTaskRepository = managementTaskRepository;
    }

    /**
     * マネジメントタスク情報を返却する
     *
     * @return マネジメントタスク情報
     */
    public ManagementTaskResponse loadManagementTasks() {
        List<ManagementTaskEntity> managementTaskEntities = managementTaskRepository.findAll();
        return ManagementTasksResponseFactory.create(managementTaskEntities);
    }
}
