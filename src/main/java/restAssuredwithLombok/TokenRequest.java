package restAssuredwithLombok;
import lombok.Data;

@Data

public class TokenRequest {
	private String username;
    private String password;

}
