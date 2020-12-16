package com.cts.pas.consumer.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Consumer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int consumerId;

	@NotEmpty
	private String consumerName;
	@NotNull
	private Date dob;
	@NotEmpty
	private String pan;
	@NotEmpty @Email 
	private String email;

	boolean validity;

	private String agentId;

	@NotEmpty
	private String businessOverview;

}
