package pastelaria.pastelaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import pastelaria.pastelaria.model.ModeloPastel;
import pastelaria.pastelaria.model.excetion.ResourceBadRequestException;
import pastelaria.pastelaria.model.excetion.ResourceNotFoundException;
import pastelaria.pastelaria.repository.ModeloPastelRepository;

@Service
public class ModeloPastelService {

    @Autowired
    private ModeloPastelRepository modeloPastelRepository;

    public ModeloPastel adicionar(ModeloPastel modeloPastel) {

        if (modeloPastel.getTamanho().equals("")) {
            throw new ResourceBadRequestException("O nome do modelo da Pastel é obrigatorio.");
        }

        modeloPastel.setId(0);
        return modeloPastelRepository.save(modeloPastel);
    }

    public List<ModeloPastel> obterTodos() {
        return modeloPastelRepository.findAll();
    }

    public Optional<ModeloPastel> obterPorId(long id) {
        Optional<ModeloPastel> modeloPastelLocalizado = modeloPastelRepository.findById(id);

        if (modeloPastelLocalizado.isEmpty()) {
            throw new ResourceNotFoundException("Não foi possivel encontrar um modelo de Pastel com o id: " + id);
        }
        return modeloPastelLocalizado;
    }

    public ModeloPastel atualizar(long id, ModeloPastel modeloPastel){
obterPorId(id);
        modeloPastel.setId(id);

        if(modeloPastel.getTamanho().equals("")){
            throw new ResourceBadRequestException("O nome do modelo de Pastel é obrigatorio.");
        }
        return modeloPastelRepository.save(modeloPastel);
    }

    public void deletar(long id){
        obterPorId(id);
        modeloPastelRepository.deleteById(id);
    }
}
