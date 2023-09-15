package Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionController extends Throwable{
	
	@ExceptionHandler(value=AppExceptionController.class)
	public  ResponseEntity<Object> exception(EntityNotfoundException exception) {

}
