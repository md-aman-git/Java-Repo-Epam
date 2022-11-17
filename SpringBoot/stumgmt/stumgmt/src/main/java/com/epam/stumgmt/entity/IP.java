package com.epam.stumgmt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IP {
	private String ip;
	private String hostname;
	private String city;
	private String region;
	private String country;
	private String loc;
	private String org;
	private String timezone;
	private String readme;
}
