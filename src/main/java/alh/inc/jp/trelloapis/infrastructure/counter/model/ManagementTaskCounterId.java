package alh.inc.jp.trelloapis.infrastructure.counter.model;

import java.io.Serializable;

/**
 * マネジメントタスクカウンターのプライマリキー
 */
public class ManagementTaskCounterId implements Serializable {

    /**
     * タスクID
     */
    private String taskId;

    /**
     * 社員番号
     */
    private int employeeNo;

    public String getTaskId() {
        return taskId;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public ManagementTaskCounterId() {
    }

    /**
     * コンストラクター
     *
     * @param taskId タスクID
     * @param employeeNo 社員番号
     */
    public ManagementTaskCounterId(String taskId, int employeeNo) {
        this.taskId = taskId;
        this.employeeNo = employeeNo;
    }
}
