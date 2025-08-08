package com.kissan.assistant.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kissan.assistant.kissandto.CreateKissanDTO;
import com.kissan.assistant.kissandto.KissanDTO;
import com.kissan.assistant.service.KissanService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Kissans")
public class KissanController {
	
	private final KissanService kissanService;
	
	@GetMapping
	public ResponseEntity<List<KissanDTO>> getAllKissan(){
		return ResponseEntity.status(HttpStatus.OK).body(kissanService.getAllKissan());
		
}
	
	
	@GetMapping("/{id}")
	public ResponseEntity <KissanDTO>getById(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(kissanService.getById(id));

}
	@PostMapping
	public ResponseEntity<KissanDTO>createKissan( @RequestBody @Valid CreateKissanDTO createKissanDTO){
		
			return ResponseEntity.status(HttpStatus.CREATED).body(kissanService.createKissan(createKissanDTO));
		
		
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void>deleteKissan(@PathVariable Long id){
		kissanService.deleteById(id);
		return ResponseEntity.noContent().build();
				}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<KissanDTO>updateKissan(@PathVariable Long id, @RequestBody CreateKissanDTO createKissanDTO ) {
		return ResponseEntity.status(HttpStatus.OK).body(kissanService.updateKissan(id,createKissanDTO));
	}
	
	
	
	@PatchMapping("/{id}")
	public ResponseEntity<KissanDTO>updatePartialKissan(@PathVariable Long id, @RequestBody Map<String, Object> updates){
		return ResponseEntity.status(HttpStatus.OK).body(kissanService.updatePartialKissan(id,updates));
	}
	
	
	
	
	
	
	
	

	
	
}