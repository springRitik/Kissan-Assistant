package com.kissan.assistant.kissandto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KissanDTO {
	

	private long id;
	private int code;
	private String name;
	
	private float weight;
	private LocalDate toWeighDate;
	
	
	
}