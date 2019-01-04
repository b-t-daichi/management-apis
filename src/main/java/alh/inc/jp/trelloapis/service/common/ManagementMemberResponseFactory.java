package alh.inc.jp.trelloapis.service.common;

import alh.inc.jp.trelloapis.controller.model.ManagementMemberResponse;
import alh.inc.jp.trelloapis.infrastructure.common.model.ManagementMemberEntity;
import alh.inc.jp.trelloapis.service.common.model.ManagementMemberDto;

import java.util.ArrayList;
import java.util.List;

/**
 * マネジメントメンバーレスポンスを作成するファクトリ
 */
public class ManagementMemberResponseFactory {

//    TODO: あとで削除　
//    public static ManagementMemberResponse create(MiddleMemberResponse response) {
//        List<ManagementMemberDto> middleMemberDtoList = new ArrayList<>();
//        for (MiddleMember middleMember : response.getManagementMembers()) {
//            ManagementMemberDto middleMemberDto = new ManagementMemberDto(middleMember.getEmployeeNo(), middleMember.getName());
//            middleMemberDtoList.add(middleMemberDto);
//        }
//        return new ManagementMemberResponse(middleMemberDtoList);
//    }

    /**
     * マネジメントメンバーレスポンスを返却する
     *
     * @param managementMemberEntities マネジメントメンバーエンティティのリスト
     * @return マネジメントメンバーレスポンス
     */
    public static ManagementMemberResponse create(List<ManagementMemberEntity> managementMemberEntities) {
        List<ManagementMemberDto> managementMemberDtoList = new ArrayList<>();
        for (ManagementMemberEntity managementMember : managementMemberEntities) {
            if (!managementMember.isDisabled()) {
                ManagementMemberDto managementMemberDto = new ManagementMemberDto(
                        managementMember.getEmployeeNo(), managementMember.getName(), managementMember.getRole());
                managementMemberDtoList.add(managementMemberDto);
            }
        }
        return new ManagementMemberResponse(managementMemberDtoList);
    }
}
