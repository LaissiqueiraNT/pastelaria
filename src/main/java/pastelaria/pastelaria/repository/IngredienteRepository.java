package pastelaria.pastelaria.repository;

import pastelaria.pastelaria.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}