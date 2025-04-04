package lv.venta.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "Person_Table")//MYSQL - person_table
@Entity
public class Person {
	@Setter(value = AccessLevel.NONE)
	@Id
	@Column(name = "IDP")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IDP;
	
	@NotNull
	@Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀČŅ]{1}[a-zēūīļķģšāžčņ]+")
	@Size(min = 3, max = 20)
	@Column(name = "Name")
	private String name;
	
	@NotNull
	@Pattern(regexp = "^\\d{6}(?:\\d{3})\\d{2}$")
	@Size(min = 12, max = 12)
	@Column(name = "persCode")
	private String persCode;
	
	
	@NotNull
	@Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀČŅ]{1}[a-zēūīļķģšāžčņ]+")
	@Size(min = 3, max = 25)
	@Column(name = "Surname")
	private String surname;
	
	

	
	public Person(String name, String surname, String persCode) {
		setName(name);
		setSurname(surname);
		setPersCode(persCode);
		
	}
}