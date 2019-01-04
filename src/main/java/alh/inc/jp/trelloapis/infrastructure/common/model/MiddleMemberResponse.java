package alh.inc.jp.trelloapis.infrastructure.common.model;

import java.util.List;

public class MiddleMemberResponse {

    private List<MiddleMember> middleMembers;

    public List<MiddleMember> getMiddleMembers() {
        return middleMembers;
    }

    public MiddleMemberResponse(List<MiddleMember> middleMembers) {
        this.middleMembers = middleMembers;
    }
}
