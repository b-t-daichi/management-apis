package alh.inc.jp.trelloapis.infrastructure.common.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * マネジメントタスク情報を格納するエンティティ
 */
@Entity
@Table(name = "management_task")
public class ManagementTaskEntity {

    /**
     * タスクID
     */
    @Id
    private String taskId;

    /**
     * 名称
     */
    private String name;

    /**
     * 無効フラグ
     */
    private boolean isDisabled;

    /**
     * 更新日時
     */
    private LocalDateTime updateDatetime;

    public String getTaskId() {
        return taskId;
    }

    public String getName() {
        return name;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public ManagementTaskEntity() {
    }

    public ManagementTaskEntity(String taskId, String name, boolean isDisabled, LocalDateTime updateDatetime) {
        this.taskId = taskId;
        this.name = name;
        this.isDisabled = isDisabled;
        this.updateDatetime = updateDatetime;
    }
}
