package alh.inc.jp.trelloapis.infrastructure.common;

import alh.inc.jp.trelloapis.infrastructure.common.model.ManagementMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * マネジメントメンバーリポジトリ
 */
@Repository
public interface  ManagementMemberRepository extends JpaRepository<ManagementMemberEntity, Integer> {
}
