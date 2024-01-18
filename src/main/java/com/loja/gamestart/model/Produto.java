package com.loja.gamestart.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O atributo nome do produto é obrigatório!")
	@Size(min = 5, max = 30, message = "O atributo nome do produto deve conter no mínimo 05 e no máximo 30 caracteres")
	private String nomeProduto;
	
	@NotNull(message = "O atributo preço do produto é obrigatório!")
	private Double precoProduto;
	
	@NotNull(message = "O atributo descrição do produto é obrigatório!")
	@Size(min = 5, max = 180, message = "O atributo preço do produto deve conter no mínimo 05 e no máximo 180 caracteres")
	private String descricaoProduto;
	
	@NotNull(message = "O atributo classificação indicadtiva do produto é obrigatório!")
	@Size(min = 5, max = 30, message = "O atributo classificação indicaditiva deve conter no mínimo 05 e no máximo 30 caracteres")
	private String classificacaoIndicativa;
	
	@NotNull(message = "O atributo gênero do produto é obrigatório!")
	private String generoJogo;
	
	@NotNull(message = "O atributo modalidade do produto é obrigatório!")
	private String modalidadeJogo;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}

	public void setClassificacaoIndicativa(String classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}

	public String getGeneroJogo() {
		return generoJogo;
	}

	public void setGeneroJogo(String generoJogo) {
		this.generoJogo = generoJogo;
	}

	public String getModalidadeJogo() {
		return modalidadeJogo;
	}

	public void setModalidadeJogo(String modalidadeJogo) {
		this.modalidadeJogo = modalidadeJogo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	

}
