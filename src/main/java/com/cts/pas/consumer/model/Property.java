package com.cts.pas.consumer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int propertyId;

	@Min(value = 0)
	private int businessId;

	@Min(value = 0)
	private int consumerId;

	@Min(value = 0)
	private long areaOfBuilding;

	@NotEmpty
	private String propertyType;

	@Min(value = 0)
	private int ageOfProperty;

	@Min(value = 0)
	private int noOfStoreys;

	@Min(value = 0)
	private long costOfAsset;

	@Min(value = 0)
	private long salvageValue;

}
