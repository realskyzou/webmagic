package us.codecraft.webmagic;

public class HttpStatusException extends RuntimeException {
    private int code;

    public HttpStatusException(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
