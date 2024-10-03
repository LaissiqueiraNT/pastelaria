package pastelaria.pastelaria.service;

import pastelaria.pastelaria.model.Ingrediente;
import pastelaria.pastelaria.model.excetion.ResourceBadRequestException;
import pastelaria.pastelaria.model.excetion.ResourceNotFoundException;
import pastelaria.pastelaria.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredienteService {
     @Autowired
    private IngredienteRepository ingredienteRepository;

    public Ingrediente adicionar(Ingrediente ingrediente){

        if(ingrediente.getNome().equals("")){
            throw new ResourceBadRequestException("O nome do ingrediente é");
        }

        ingrediente.setId(0);
        return ingredienteRepository.save(ingrediente);
    }

    public List<Ingrediente> obterTodos(){
        return ingredienteRepository.findAll();
    }

    public Optional<Ingrediente> obterPorId(long id){

        Optional<Ingrediente> ingredienteLocalizado = ingredienteRepository.findById(id);

        if(ingredienteLocalizado.isEmpty()){
            throw new ResourceNotFoundException("Não foi possivel encontrar um ingrediente com o id: " + id);
        }

        return ingredienteLocalizado;
    }

    public Ingrediente atualizar(long id, Ingrediente ingrediente){

        obterPorId(id);
        ingrediente.setId(id);

        if(ingrediente.getNome().equals("")){
            throw new ResourceBadRequestException("O nome do ingrediente é obrigatorio.");
        }

        return ingredienteRepository.save(ingrediente);
    }

    public void deletar(long id){
        obterPorId(id);
        ingredienteRepository.deleteById(id);
    }
}
