package pastelaria.pastelaria.service;
import java.util.List;
import java.util.Optional;

import pastelaria.pastelaria.model.ModeloPastel;
import pastelaria.pastelaria.model.excetion.ResourceBadRequestException;
import pastelaria.pastelaria.model.excetion.ResourceNotFoundException;
import pastelaria.pastelaria.repository.ModeloPastelRepository;

import springframework.beans.factory.annotation.Autowired;
import springframework.stereotype.Service;

@org.springframework.stereotype.Service
//@Service
public class ModeloPastelService {
    
    @Autowired
    private ModeloPastel
    Repository modeloPastel
    Repository;

    public ModeloPastel
     adicionar(ModeloPastel
     modeloPastel
    ){

        if(modeloPastel
        .getTamanho().equals("")){
            throw new ResourceBadRequestException("O nome do modelo da Pastel
             é obrigatorio.");
        }

        modeloPastel
        .setId(0);
        return modeloPastel
        Repository.save(modeloPastel
        );
    }

    public List<ModeloPastel
    > obterTodos(){
        return modeloPastel
        Repository.findAll();
    }

    public Optional<ModeloPastel
    > obterPorId(long id){

        Optional<ModeloPastel
        > modeloPastel
        Localizado = modeloPastel
        Repository.findById(id);

        if(modeloPastel
        Localizado.isEmpty()){
            throw new ResourceBadRequestException("Não foi possivel encontrar um modelo de Pastel
             com o id: " + id);
        }

        return modeloPastel
        Localizado;
    }

    public ModeloPastel
     atualizar(long id, ModeloPastel
     modeloPastel
    ){

        obterPorId(id);
        modeloPastel
        .setId(id);

        if(modeloPastel
        .getTamanho().equals("")){
            throw new ResourceBadRequestException("O nome do modelo de Pastel
             é obrigatorio.");
        }

        return modeloPastel
        Repository.save(modeloPastel
        );
    }

    public void deletar(long id){
        obterPorId(id);
        modeloPastel
        Repository.deleteById(id);
    }
}
