package pastelaria.pastelaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import pastelaria.pastelaria.model.ModeloPastel; 
import pastelaria.pastelaria.service.ModeloPastelService; 

@CrossOrigin("*")
@RestController
@RequestMapping("/api/modelo-pastel")
public class ModeloPastelController {
    
    @Autowired
    private ModeloPastelService modeloPastelService;

    @GetMapping   
    public ResponseEntity<List<ModeloPastel>> obterTodos(){
        return ResponseEntity.ok(modeloPastelService.obterTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ModeloPastel>> obterPorId(@PathVariable long id){
        return ResponseEntity.ok(modeloPastelService.obterPorId(id));
    }

    @PostMapping    
    public ResponseEntity<ModeloPastel> adicionar(@RequestBody ModeloPastel modeloPastel){
        ModeloPastel modeloPastelCriado = modeloPastelService.adicionar(modeloPastel);
        return new ResponseEntity<>(modeloPastelCriado, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModeloPastel> atualizar(@PathVariable long id, @RequestBody ModeloPastel modeloPastel){
        return ResponseEntity.ok(modeloPastelService.atualizar(id, modeloPastel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable long id){
        modeloPastelService.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
