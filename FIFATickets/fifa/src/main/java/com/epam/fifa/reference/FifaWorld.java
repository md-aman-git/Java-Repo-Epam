package com.epam.fifa.reference;

import java.util.HashMap;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FifaWorld {
	private HashMap<String, Stadium> stadiums;
}
