package alh.inc.jp.trelloapis.infrastructure.common.modle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "management_task")
@IdClass(ManagementTaskCounterId.class)
public class ManagementTaskCounterEntity {

    @Id
    private String taskId;

    @Id
    private int employeeNo;

    private int executionCount;

    private int passesCount;

    private LocalDateTime updateDatetime;

    public String getTaskId() {
        return taskId;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public int getExecutionCount() {
        return executionCount;
    }

    public int getPassesCount() {
        return passesCount;
    }

    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    public ManagementTaskCounterEntity() {
    }

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
