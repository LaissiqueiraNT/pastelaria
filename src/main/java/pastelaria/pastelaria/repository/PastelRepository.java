package pastelaria.pastelaria.repository;

import pastelaria.pastelaria.model.Pastel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PastelRepository extends JpaRepository<Pastel, Long> {
    
}
