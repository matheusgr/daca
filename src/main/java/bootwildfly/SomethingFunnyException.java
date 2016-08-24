package bootwildfly;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="No such Order")  // 404
public class SomethingFunnyException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
}
