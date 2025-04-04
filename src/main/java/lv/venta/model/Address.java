package lv.venta.model;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lv.venta.model.enums.City;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "AddressTable") // MYSQL - Address_table
@Entity
public class Address {
	
	@Setter(value = AccessLevel.NONE)
	@Id
	@Column(name = "AId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long aid;
	
	@NotNull
	@Column(name = "City")
	private City city;
	
	@NotNull
	@Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀČŅa-zēūīļķģšāžčņ ]+")
	@Size(min = 4, max = 50)
	@Column(name = "Title")
	private String title;
	
	@Column(name = "HouseNo")
	@Min(1)
	@Max(1000)
	private int houseno;
	
	public Address(City city,int houseno, String title) {
			
			setCity(city);
			setHouseno(houseno);
			setTitle(title);
		}
	
}
