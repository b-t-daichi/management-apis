package alh.inc.jp.trelloapis.service.common;

import alh.inc.jp.trelloapis.infrastructure.common.ManagementMemberRepository;
import alh.inc.jp.trelloapis.infrastructure.common.model.ManagementMemberEntity;
import alh.inc.jp.trelloapis.controller.model.ManagementMemberResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ミドルメンバー情報を扱うサービス
 */
@Service
public class ManagementMemberService {

//    TODO: あとで削除　
//    private final MiddleMemberApiClient middleMemberApiClient;
    private final ManagementMemberRepository managementMemberRepository;

    /**
     * コンストラクター
     *
     * @param managementMemberRepository マネジメントメンバーリポジトリ
     */
    public ManagementMemberService(ManagementMemberRepository managementMemberRepository) {
//        TODO: あとで削除　
//        this.middleMemberApiClient = middleMemberApiClient;
        this.managementMemberRepository = managementMemberRepository;
    }

    /**
     * マネジメントメンバー情報を返却する
     *
     * @return マネジメントメンバー情報
     */
    public ManagementMemberResponse loadManagementMemberList() {
//        TODO: あとで削除　
//        MiddleMemberResponse response = middleMemberApiClient.loadManagementMemberList();
        List<ManagementMemberEntity> memberEntities = managementMemberRepository.findAll();
        return ManagementMemberResponseFactory.create(memberEntities);
    }
}
