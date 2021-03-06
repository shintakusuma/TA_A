package com.siasisten.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LowonganModelDTO {
	@NotNull
	private int id;
	@NotNull
	private String namaMatkul;
	@NotNull
	private int isOpen;
	@NotNull @NumberFormat(style = Style.NUMBER) @Min(1)
	private int jmlLowongan;
	private int isRegister;
}
