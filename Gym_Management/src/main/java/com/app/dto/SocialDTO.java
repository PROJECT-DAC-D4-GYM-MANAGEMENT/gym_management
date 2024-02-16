package com.app.dto;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SocialDTO {
	 @JsonProperty(access = Access.READ_ONLY)
	private Long id;
	private String facebook;

	private String twitter;

	private String linkedin;

	private String instagram;

}
