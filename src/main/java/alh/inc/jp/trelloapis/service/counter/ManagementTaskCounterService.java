package alh.inc.jp.trelloapis.service.counter;

import alh.inc.jp.trelloapis.controller.model.ManagementTaskCounterUpdateRequest;
import alh.inc.jp.trelloapis.controller.model.ManagementTaskCounterResponse;
import alh.inc.jp.trelloapis.infrastructure.counter.ManagementTaskCounterRepository;
import alh.inc.jp.trelloapis.infrastructure.counter.model.ManagementTaskCounterEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * マネジメントタスクカウンターを扱うサービス
 */
@Service
public class ManagementTaskCounterService {

    private final ManagementTaskCounterRepository managementTaskCounterRepository;

    /**
     * コンストラクター
     *
     * @param managementTaskCounterRepository マネジメントタスクカウンターリポジトリ
     */
    public ManagementTaskCounterService(ManagementTaskCounterRepository managementTaskCounterRepository) {
        this.managementTaskCounterRepository = managementTaskCounterRepository;
    }

    /**
     * マネジメントタスクカウンターを返却する
     *
     * @param taskId タスクID
     * @return
     */
    public ManagementTaskCounterResponse loadManagementTaskCounter(String taskId) {
        List<ManagementTaskCounterEntity> memberEntities = managementTaskCounterRepository.findByTaskId(taskId);
        return ManagementTaskCounterResponseFactory.create(memberEntities);
    }

    /**
     * マネジメントタスクカウンターを更新する
     *
     * @param managementTaskCounterUpdateRequest
     */
    public void updateManagementTaskCounter(ManagementTaskCounterUpdateRequest managementTaskCounterUpdateRequest) {
        ManagementTaskCounterEntity managementTaskCounterEntity =
                ManagementTaskCounterEntityFactory.create(managementTaskCounterUpdateRequest);
        managementTaskCounterRepository.save(managementTaskCounterEntity);
    }

}
