package com.motivity.DropwizardJDBI;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;


public class motivityConfiguration extends Configuration {
   
	@Valid
	@NotNull
	private DataSourceFactory database= new DataSourceFactory();

	@JsonProperty("database")
	public void setDataSourceFactory(DataSourceFactory factory) {
		this.database=factory;
	}
	
	@JsonProperty("database")
	public DataSourceFactory getDataSourceFactory() {
		return database;
	}
	
	
	
	
}
