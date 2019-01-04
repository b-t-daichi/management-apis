package alh.inc.jp.trelloapis.infrastructure.common.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * マネジメントタスクの情報を格納するエンティティ
 */
@Entity
@Table(name = "management_member")
public class ManagementMemberEntity {

    /**
     * 社員番号
     */
    @Id
    private int employeeNo;

    /**
     * 氏名
     */
    private String name;

    /**
     * 役割
     */
    private String role;

    /**
     * 無効フラグ
     */
    private boolean isDisabled;

    /**
     * 登録日時
     */
    private LocalDateTime registerDatetime;

    /**
     * 更新日時
     */
    private LocalDateTime updateDatetime;

    public int getEmployeeNo() {
        return employeeNo;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public LocalDateTime getRegisterDatetime() {
        return registerDatetime;
    }

    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    public ManagementMemberEntity() {}

    public ManagementMemberEntity(
            int employeeNo,
            String name,
            String role,
            boolean isDisabled,
            LocalDateTime registerDatetime,
            LocalDateTime updateDatetime) {
        this.employeeNo = employeeNo;
        this.name = name;
        this.role = role;
        this.isDisabled = isDisabled;
        this.registerDatetime = registerDatetime;
        this.updateDatetime = updateDatetime;
    }
}
