package com.esporte.taxas.dto;

import java.util.UUID;
	
	public record taxaDTO (UUID Id,String resultado,int round,int abates,int mortes,int hs,String imagem) {
		  
	}