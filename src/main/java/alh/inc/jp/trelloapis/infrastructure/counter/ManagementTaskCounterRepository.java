package alh.inc.jp.trelloapis.infrastructure.counter;

import alh.inc.jp.trelloapis.infrastructure.counter.model.ManagementTaskCounterEntity;
import alh.inc.jp.trelloapis.infrastructure.counter.model.ManagementTaskCounterId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * マネジメントタスクリポジトリ
 */
public interface ManagementTaskCounterRepository
        extends JpaRepository<ManagementTaskCounterEntity, ManagementTaskCounterId> {

    /**
     * マネジメントタスクカウンターのリストを返却する
     *
     * @param taskId タスクID
     * @return マネジメントタスクカウンターのリスト
     */
    public List<ManagementTaskCounterEntity> findByTaskId(String taskId);
}
