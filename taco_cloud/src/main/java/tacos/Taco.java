package tacos;


import java.sql.Date;
//import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data

public class Taco {
	private Long id;
	private String name;
	private Date createdAt;
	private List<Ingredient> ingredients;
  
} 



