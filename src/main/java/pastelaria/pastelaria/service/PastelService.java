package pastelaria.pastelaria.service;

import pastelaria.pastelaria.model.Pastel;
import pastelaria.pastelaria.model.excetion.ResourceBadRequestException;
import pastelaria.pastelaria.model.excetion.ResourceNotFoundException;
import pastelaria.pastelaria.repository.PastelRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PastelService {

    @Autowired
    private PastelRepository pastelRepository;

    public Pastel adicionar(Pastel pastel) {
       

        if (pastel.getNome().equals("")) {
            throw new ResourceBadRequestException("O nome da Pastel é obrigatorio.");
        }

        pastel.setId(0);
        return pastelRepository.save(pastel);
    }

    public List<Pastel> obterTodos() {
        return pastelRepository.findAll();
    }

    public Optional<Pastel> obterPorId(long id) {

        Optional<Pastel> pastelLocalizado = pastelRepository.findById(id);

        if (pastelLocalizado.isEmpty()) {
            throw new ResourceNotFoundException("Não foi possivel encontrar um modelo de Pastel com o id: " + id);
        }

        return pastelLocalizado;
    }

    public Pastel atualizar(long id, Pastel pastel) {

        obterPorId(id);
        pastel.setId(id);

        if (pastel.getNome().equals("")) {
            throw new ResourceBadRequestException("O nome da Pastel é obrigatorio.");
        }

        return pastelRepository.save(pastel);
    }

    public void deletar(long id){
        obterPorId(id);
        pastelRepository.deleteById(id);
}
