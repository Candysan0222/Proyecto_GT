package com.ProyectoGT.proyectoGT.Controller.ObjetoT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ProyectoGT.proyectoGT.Service.ObjetoT.ObjetoTService;
import com.ProyectoGT.proyectoGT.Utils.ApiResponseDto;


public class ObjetoTController<T> {
	
	@Autowired
	private ObjetoTService<T> service;
	
	@PostMapping("/")
    public T save(@RequestBody T objeto) throws Exception{
        return service.save(objeto);
    }
	
	@GetMapping ("/")
	public ResponseEntity<Object> findAll(){
		var ListarObjetos = service.all();
		return new ResponseEntity<>(ListarObjetos, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <Object> findById (@PathVariable Long id){
		var objeto = service.findById(id);
		return new ResponseEntity<>(objeto, HttpStatus.OK);
	}
	
	
	@PutMapping("{id}")
    public ResponseEntity<ApiResponseDto<T>> update(@PathVariable Long id, @RequestBody T objeto) {
        try {
            service.update(id, objeto);
            return ResponseEntity.ok(new ApiResponseDto<T>("Datos actualizados", null, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<T>(e.getMessage(), null, false));
        }
    }
	
	@DeleteMapping ("/{id}") 
	public ResponseEntity<Object> delete (@PathVariable Long id){
		service.delete(id);
		return new ResponseEntity<> ("Registro Eliminado", HttpStatus.OK);
	}
}
