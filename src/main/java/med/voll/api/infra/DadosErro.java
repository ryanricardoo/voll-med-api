package med.voll.api.infra;

import org.springframework.validation.FieldError;

public record DadosErro(String campo, String menssagem) {

    public DadosErro(FieldError erro){
        this(erro.getField(), erro.getDefaultMessage());
    }
 }
