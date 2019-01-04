package alh.inc.jp.trelloapis.infrastructure.counter.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * マネジメントタスクカウンター情報を格納するエンティティ
 */
@Entity
@Table(name = "management_task_counter")
@IdClass(ManagementTaskCounterId.class)
public class ManagementTaskCounterEntity {

    /**
     * タスクID
     */
    @Id
    private String taskId;

    /**
     * 社員番号
     */
    @Id
    private int employeeNo;

    /**
     * 実施回数
     */
    private int executionCount;

    /**
     * パス回数
     */
    private int passesCount;

    /**
     * 更新日時
     */
    private LocalDateTime updateDatetime;

    public String getTaskId() { return taskId; }

    public int getEmployeeNo() { return employeeNo; }

    public int getExecutionCount() { return executionCount; }

    public int getPassesCount() { return passesCount; }

    public LocalDateTime getUpdateDatetime() { return updateDatetime; }

    public ManagementTaskCounterEntity() {
    }

    /**
     * コンストラクター
     *
     * @param taskId タスクID
     * @param employeeNo 社員番号
     * @param executionCount 実施回数
     * @param passesCount パス回数
     * @param updateDatetime 更新日時
     */
    public ManagementTaskCounterEntity(
            String taskId,
            int employeeNo,
            int executionCount,
            int passesCount,
            LocalDateTime updateDatetime) {
        this.taskId = taskId;
        this.employeeNo = employeeNo;
        this.executionCount = executionCount;
        this.passesCount = passesCount;
        this.updateDatetime = updateDatetime;
    }
}
