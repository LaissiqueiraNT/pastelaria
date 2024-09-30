package pastelaria.pastelaria.repository;
import pastelaria.pastelaria.model.ModeloPastel;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ModeloPastelRepository extends JpaRepository<ModeloPastel, Long>{
    
}