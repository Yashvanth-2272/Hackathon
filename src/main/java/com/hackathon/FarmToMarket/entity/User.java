package com.hackathon.FarmToMarket.entity;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	private int userId;
	private String name;
	private String type;
	private String email;
	private Long phnNo;

}
