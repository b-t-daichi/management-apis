package alh.inc.jp.trelloapis.exception.common;

public enum ErrorCode {
    TRELLO_APIS_ERROR_0001 ("TRELLO_APIS_ERROR_0001", "error");

    private final String errorCode;
    private final String errorMessge;

    ErrorCode(String errorCode, String errorMessge) {
        this.errorCode = errorCode;
        this.errorMessge = errorMessge;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessge() {
        return errorMessge;
    }
}
