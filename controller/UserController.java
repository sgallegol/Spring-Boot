package com.pruebanttdata.samir.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebanttdata.samir.entity.User;
import com.pruebanttdata.samir.exceptions.ExceptionModel;
import com.pruebanttdata.samir.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private  UserService userService;
	//crearemos un nuevo usuario
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
	}
	
   //Read un user
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable("id") Long userId){
		Optional<User> oUser=userService.findById(userId);
		
		if(oUser==null) {
			throw new ExceptionModel("cliente no encontrado");
		}
		return new ResponseEntity<>(oUser,HttpStatus.NOT_FOUND);
	}
	
	
	//actualizarenmos un usuario
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody User userDetails, @PathVariable(value="id") Long userId) {
		Optional<User> user=userService.findById(userId);
		if(!user.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		user.get().setPrimerNombre(userDetails.getPrimerNombre());
		user.get().setSegundoNombre(userDetails.getSegundoNombre());
		user.get().setPrimerApellido(userDetails.getPrimerApellido());
		user.get().setSegundoApellido(userDetails.getSegundoApellido());
		user.get().setCiudadResidencia(userDetails.getCiudadResidencia());
		user.get().setDireccion(userDetails.getDireccion());
		user.get().setTelefono(userDetails.getTelefono());
		user.get().setCeduladeCiudadania(userDetails.getCeduladeCiudadania());
		
		return  ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user.get()));
	}
	
	//borraremos un usuario
@DeleteMapping("/{id}")
public ResponseEntity<?> delete(@PathVariable("id") Long userId) throws Exception {
	Optional user=userService.findById(userId);
	if(user==null) {
		throw new ExceptionModel("el cliente que desea aliminar no existe");
		
	}
	userService.deleteById(userId);
	return new ResponseEntity<>(HttpStatus.OK);
	
}
	
	
	//leemos todos los usuarios de nuestra base de datos
	public List<User> readAll(){
		List<User> users=StreamSupport
				.stream(userService.finAll().spliterator(), false)
			   .collect(Collectors.toList());
			   
			   return users;
	}
	

}


