package br.com.capflix.model.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.capflix.model.MarcaCarro;
import br.com.capflix.model.TipoAutomovel;
import br.com.capflix.model.TipoCompra;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClienteSaidaDto {

	private Integer id;

	private String nome;

	private String email;

	private String cpf;

	private TipoAutomovel tipoAutomovel;
	
	private MarcaCarro marcaCarro;

	private TipoCompra tipoCompra;

	private String preco;


	private String modeloCarro;

}
