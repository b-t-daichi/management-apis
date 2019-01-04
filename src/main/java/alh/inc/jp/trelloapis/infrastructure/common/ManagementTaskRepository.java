package alh.inc.jp.trelloapis.infrastructure.common;

import alh.inc.jp.trelloapis.infrastructure.common.model.ManagementTaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * マネジメントタスクリポジトリ
 */
@Repository
public interface ManagementTaskRepository extends JpaRepository<ManagementTaskEntity, String> {
}
