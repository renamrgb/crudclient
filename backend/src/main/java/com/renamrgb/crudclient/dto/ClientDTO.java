package com.renamrgb.crudclient.dto;

import java.time.Instant;

import com.renamrgb.crudclient.entities.Client;

public class ClientDTO {

	
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private Instant birhDate;
	private Integer children;
	
	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String cpf, Double income, Instant birhDate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birhDate = birhDate;
		this.children = children;
	}

	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.income = entity.getIncome();
		this.birhDate = entity.getBirhDate();
		this.children = entity.getChildren();
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Instant getBirhDate() {
		return birhDate;
	}

	public void setBirhDate(Instant birhDate) {
		this.birhDate = birhDate;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}
	
	
	
	
}
