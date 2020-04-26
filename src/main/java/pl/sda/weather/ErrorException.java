package pl.sda.weather;

public class ErrorException {
    private boolean success;
    private Error error;

    public ErrorException() {}
    public ErrorException(boolean success, Error error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
class Error {
    private int code;
    private String type;
    private String info;

    public Error() {}
    public Error(int code, String type, String info) {
        this.code = code;
        this.type = type;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
