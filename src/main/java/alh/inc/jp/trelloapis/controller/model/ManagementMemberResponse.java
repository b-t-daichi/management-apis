package alh.inc.jp.trelloapis.controller.model;

import alh.inc.jp.trelloapis.service.common.model.ManagementMemberDto;

import java.util.List;

/**
 * ミドルメンバー情報を格納するクラス
 */
public class ManagementMemberResponse {

    private List<ManagementMemberDto> managementMemberDtoList;

    public List<ManagementMemberDto> getManagementMemberDtoList() {
        return managementMemberDtoList;
    }

    /**
     * コンストラクター
     *
     * @param managementMemberDtoList マネジメントメンバーDtoのリスト
     */
    public ManagementMemberResponse(List<ManagementMemberDto> managementMemberDtoList) {
        this.managementMemberDtoList = managementMemberDtoList;
    }
}
