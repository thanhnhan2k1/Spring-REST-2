package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.AccessLevel;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(force=true)
public class Ingredient {
	  private final String id;
	  private final String name;
	  private final Type type;
	  public static enum Type {
	    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	  } 

}


