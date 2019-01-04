package alh.inc.jp.trelloapis.service.counter.model;

/**
 * マネジメントタスクカウンターの情報を格納するDto
 */
public class ManagementTaskCounterDto {

    /**
     * タスクID
     */
    private String taskId;

    /**
     * 社員番号
     */
    private int employeeNo;

    /**
     * 実施回数
     */
    private int executionCount;

    /**
     * パス回数
     */
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
     *
     * @param taskId タスクID
     * @param employeeNo 社員番号
     * @param executionCount 実施回数
     * @param passesCount パス回数
     */
    public ManagementTaskCounterDto(String taskId, int employeeNo, int executionCount, int passesCount) {
        this.taskId = taskId;
        this.employeeNo = employeeNo;
        this.executionCount = executionCount;
        this.passesCount = passesCount;
    }
}
