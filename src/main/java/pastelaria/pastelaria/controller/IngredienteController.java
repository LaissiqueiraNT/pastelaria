package pastelaria.pastelaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pastelaria.pastelaria.model.Ingrediente;
import pastelaria.pastelaria.service.IngredienteService;
import scala.collection.immutable.List;
@CrossOrigin("")
@RestController
@RequestMapping("/api/ingredientes")
public class IngredienteController {
    @Autowired

    private IngredienteService ingredienteService;

@GetMapping()

    
    public List<Ingrediente> obterTodos(){
        return ingredientesService.obterTodos();
    }
    
@GetMapping("/{id}")

    public Ingrediente obterPorId(@PathVariable long)(Long id){
    ingredienteRepository.obterPorId(id);
}
@PostMapping
public Ingrediente adicionar(@RequestMapping Ingrediente ingrediente){
        return ingredienteService.adicionar(ingrediente);
    }
 @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable long id){
        ingredienteService.deletar(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
