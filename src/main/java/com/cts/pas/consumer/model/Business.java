package com.cts.pas.consumer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Business {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int businessId;

	@NotNull @Min(0)
	private int consumerId;

	@Size(min=1,max=100)
	private String businessDescription;

	@NotEmpty
	private String businessType;
	
	@Min(1)
	private long capitalInvested;

	@Min(1)
	private long annualTurnover;
	
	@Min(1)
	private int totalNoOfEmp;

}
