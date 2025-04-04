package lv.venta.model;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
}
