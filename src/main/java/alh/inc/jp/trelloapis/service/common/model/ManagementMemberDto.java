package alh.inc.jp.trelloapis.service.common.model;

/**
 * マネジメントメンバーの情報を格納するDto
 */
public class ManagementMemberDto {

    /**
     * 社員ID
     */
    private int employeeNo;

    /**
     * 氏名
     */
    private String name;

    /**
     * 役割
     */
    private String role;

    public int getEmployeeNo() {
        return employeeNo;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    /**
     * コンストラクター
     *
     * @param employeeNo 社員番号
     * @param name 氏名
     * @param role 役割
     */
    public ManagementMemberDto(int employeeNo, String name, String role) {
        this.employeeNo = employeeNo;
        this.name = name;
        this.role = role;
    }
}
