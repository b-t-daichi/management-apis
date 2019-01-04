package alh.inc.jp.trelloapis.controller.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * 更新用のマネジメントタスクカウンター情報を格納するクラス
 */
public class ManagementTaskCounterUpdateRequest {

    @NotBlank
    private String taskId;

    @Min(value = 0)
    private int employeeNo;

    @Min(value = 0)
    private int executionCount;

    @Min(value = 0)
    private int passesCount;

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

    /**
     * コンストラクター
     */
    public ManagementTaskCounterUpdateRequest() {
    }
}
