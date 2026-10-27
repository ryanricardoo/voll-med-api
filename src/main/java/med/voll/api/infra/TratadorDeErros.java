package med.voll.api.infra;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class TratadorDeErros {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<DadosErro> tratarErro404(){
        var erroDto = new DadosErro("Recurso não encontrado!");
        return ResponseEntity.status(404).body(erroDto);
    }

}
