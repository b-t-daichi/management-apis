package alh.inc.jp.trelloapis.service.common.model;

/**
 * マネジメントタスクの情報を格納するDto
 */
public class ManagementTaskDto {

    /**
     * タスクID
     */
    private String taskId;

    /**
     * 名称
     */
    private String name;

    public String getTaskId() {
        return taskId;
    }

    public String getName() {
        return name;
    }

    /**
     * コンストラクター
     *
     * @param taskId タスクID
     * @param name 名称
     */
    public ManagementTaskDto(String taskId, String name) {
        this.taskId = taskId;
        this.name = name;
    }
}
