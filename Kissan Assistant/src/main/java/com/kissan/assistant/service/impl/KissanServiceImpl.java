package com.kissan.assistant.service.impl;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.kissan.assistant.entity.Kissan;
import com.kissan.assistant.kissandto.CreateKissanDTO;
import com.kissan.assistant.kissandto.KissanDTO;
import com.kissan.assistant.repository.KissanRepository;
import com.kissan.assistant.service.KissanService;


import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class KissanServiceImpl implements KissanService{
	
	
	
	private final KissanRepository kissanRepository;
    private final ModelMapper modelMapper;
    
    //GetMapping
	@Override
	public List<KissanDTO> getAllKissan() {
		List<Kissan> kissans = kissanRepository.findAll();
		
		return kissans.stream().map(Kissan-> modelMapper.map(Kissan, KissanDTO.class)).toList();
	}


	//GetMapping{id}
	@Override
	public KissanDTO getById(Long id) {
		Kissan kissan = kissanRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Kissan Not FOUND"));
		return modelMapper.map(kissan,KissanDTO.class);
	}
	
	
	
	//PostMapping
	@Override
	public KissanDTO createKissan(CreateKissanDTO createKissanDTO) {
		Kissan newKissan = modelMapper.map(createKissanDTO, Kissan.class);
		Kissan kissan = kissanRepository.save(newKissan);
		
		return modelMapper.map(kissan, KissanDTO.class);
		
		}
	
	
	
	//DeleteMapping
	@Override
	public void deleteById(Long id) {
		
	if(!kissanRepository.existsById(id)) {
		throw new IllegalArgumentException("Kissan nNot Found");
	}
	kissanRepository.deleteById(id);
	
	}


	
	//PostMapping
	@Override
	public KissanDTO updateKissan(Long id, CreateKissanDTO createKissanDTO) {
		Kissan kissan = kissanRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Kissan Not FOUND"));
	    modelMapper.map(createKissanDTO, kissan);
	     kissan = kissanRepository.save(kissan);
		return modelMapper.map(kissan, KissanDTO.class);
	}


	//PatchMapping
	@Override
	public KissanDTO updatePartialKissan(Long id, Map<String, Object> updates) {
		Kissan kissan = kissanRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Kissan Not Found" +id));
		updates.forEach((field, Value) -> {
			switch(field){
			
				case "code": kissan.setCode((int) Value);
				break;
				
				case "name": kissan.setName((String) Value);
				break;
				
				case "weight": kissan.setWeight((float) Value);
				break;
				
				case "to": kissan.setToWeighDate((LocalDate) Value);
				break;
			}
						
		});
		
		Kissan savedkissan = kissanRepository.save(kissan);
		return modelMapper.map(savedkissan, KissanDTO.class);
		
	}
}
