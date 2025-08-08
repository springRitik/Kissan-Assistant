package com.kissan.assistant.kissandto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateKissanDTO {
	
	
	
		

		@NotBlank(message = "Code is Required EXAMPLE -'123' ")
		private int code;
		
		@NotBlank(message = "Name is Required")
		private String name;
		
		@NotBlank(message = "weight is Required")
		private float weight;
		
		@NotBlank (message = "Date is Required")
		@DateTimeFormat(pattern = "yyyy-MM-dd Date is Required")
		private LocalDate toWeighDate;
		
		
		
	}
	

