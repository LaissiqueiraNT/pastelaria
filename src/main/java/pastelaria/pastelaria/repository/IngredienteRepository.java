package pastelaria.pastelaria.repository;


import pastelaria.pastelaria.model.Ingrediente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository
public class IngredienteRepository {
    private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    private int ultimoId = 0;

    public Ingrediente adicionar(Ingrediente ingrediente) {
        ultimoId++;
        ingrediente.setId((long)ultimoId);
        ingredientes.add(ingrediente);

        return ingrediente;
    }

    public List<Ingrediente> obterTodos() {
        return ingredientes;
    }

    public Ingrediente obterPorId(Long id) {
        // ingrediente.forEach(ingredientes);
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getId() == id) {
                return ingrediente;
            }
        }
        return new Ingrediente();
    }
}
