package med.voll.api.domain.medico;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Especialidade {
        ORTOPEDIA,
        CARDIOLOGIA,
        GINECOLOGIA, 
        DERMATOLOGIA;


        @JsonCreator
        public static Especialidade fromString(String value){
                if(value == null){
                        return null;
                }
                for(Especialidade especialidade : Especialidade.values()){
                        if(especialidade.name().equalsIgnoreCase(value.trim())) {
                                return especialidade;
                        }
                }

                throw new IllegalArgumentException("Especialidade inválida: " + value);
        }
}
