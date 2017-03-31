package cc.lylllcc.dto;

/**
 * Created by lylllcc on 2017/2/24.
 */
public class JsonMes {

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JsonMes(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
