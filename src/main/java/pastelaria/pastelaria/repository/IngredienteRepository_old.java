package pastelaria.pastelaria.repository;
import pastelaria.pastelaria.model.Ingrediente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository
public class IngredienteRepository_old {
    private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    private long ultimoId = 0;

    public Ingrediente adicionar(Ingrediente ingrediente) {
        ultimoId++;
        ingrediente.setId(ultimoId);
        ingredientes.add(ingrediente);

        return ingrediente;
    }

    public List<Ingrediente> obterTodos() {
        return ingredientes;
    }

    public Ingrediente obterPorId(long id) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getId() == id) {
                return ingrediente;
            }
        }
        return new Ingrediente();
    }
}
