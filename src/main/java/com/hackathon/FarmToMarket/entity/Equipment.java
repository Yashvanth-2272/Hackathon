package com.hackathon.FarmToMarket.entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {
	@Id
	private int id;
	private String equipName;
	private String location;
	private int count;
	private String Status;
	@OneToMany
	@JoinColumn(name = "userId")
	private User user;

}

