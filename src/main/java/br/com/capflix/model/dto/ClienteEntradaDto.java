package br.com.capflix.model.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.br.CPF;

import br.com.capflix.model.MarcaCarro;
import br.com.capflix.model.TipoAutomovel;
import br.com.capflix.model.TipoCompra;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClienteEntradaDto {

	@NotNull(message = "obrigatório")
	private String nome;

	@NotBlank(message = "obrigatório")
	@Email(message = "Inválido")
	private String email;

	@NotBlank(message = "obrigatório")
	@CPF(message = "inválido")
	private String cpf;

	@NotNull(message = "obrigatório")
	private MarcaCarro marcaCarro;

	@NotBlank(message = "obrigatório")
	private String modeloCarro;

	@NotNull(message = "obrigatório")
	private TipoAutomovel tipoAutomovel;

	@NotNull(message = "obrigatório")
	private TipoCompra tipoCompra;

	@NotBlank(message = "obrigatório")
	private String preco;

}
