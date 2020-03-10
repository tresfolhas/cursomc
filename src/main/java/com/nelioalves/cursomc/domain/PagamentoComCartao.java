package com.nelioalves.cursomc.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.nelioalves.cursomc.domain.enums.EstadoPagamento;

@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Integer numerDeParcelas;

	public PagamentoComCartao() {
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numerDeParcelas) {
		super(id, estado, pedido);
		this.numerDeParcelas = numerDeParcelas;
	}

	public Integer getNumerDeParcelas() {
		return numerDeParcelas;
	}

	public void setNumerDeParcelas(Integer numerDeParcelas) {
		this.numerDeParcelas = numerDeParcelas;
	}
	
}
