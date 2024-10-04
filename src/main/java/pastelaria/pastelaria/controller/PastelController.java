package pastelaria.pastelaria.controller;

import java.util.List;
import java.util.Optional;

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

import pastelaria.pastelaria.model.Pastel; 
import pastelaria.pastelaria.service.PastelService; 

@CrossOrigin("*")
@RestController
@RequestMapping("/api/pasteis")
public class PastelController {
    
    @Autowired
    private PastelService pastelService;

    @GetMapping   
    public ResponseEntity<List<Pastel>> obterTodos(){
        return ResponseEntity.ok(pastelService.obterTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pastel>> obterPorId(@PathVariable long id){
        return ResponseEntity.ok(pastelService.obterPorId(id));
    }

    @PostMapping    
    public ResponseEntity<Pastel> adicionar(@RequestBody Pastel pastel){
        var pastelCriado = pastelService.adicionar(pastel);
        return new ResponseEntity<>(pastelCriado, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pastel> atualizar(@PathVariable long id, @RequestBody Pastel pastel){
        return ResponseEntity.ok(pastelService.atualizar(id, pastel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable long id){
        pastelService.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
