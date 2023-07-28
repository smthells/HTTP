import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class JsonToJava {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upvotes;

    public JsonToJava(@JsonProperty("id") String id,
                      @JsonProperty("text") String text,
                      @JsonProperty("type") String type,
                      @JsonProperty("user") String user,
                      @JsonProperty("upvotes") Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "JsonToJava{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes=" + upvotes +
                '}';
    }
}
