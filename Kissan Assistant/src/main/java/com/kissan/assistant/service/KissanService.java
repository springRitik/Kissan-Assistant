package com.kissan.assistant.service;

import java.util.List;
import java.util.Map;

import com.kissan.assistant.kissandto.CreateKissanDTO;
import com.kissan.assistant.kissandto.KissanDTO;

public interface KissanService {
	
	



	List<KissanDTO> getAllKissan();

	KissanDTO getById(Long id);
	
	KissanDTO createKissan(CreateKissanDTO createKissanDTO);

	void deleteById(Long id);

	KissanDTO updateKissan(Long id, CreateKissanDTO createKissanDTO);

	KissanDTO updatePartialKissan(Long id, Map<String, Object> updates);

}
