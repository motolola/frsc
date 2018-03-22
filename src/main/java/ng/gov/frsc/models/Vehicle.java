package ng.gov.frsc.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Vehicle extends Model {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "enhanced_table_seq_gen")
    @GenericGenerator(name = "enhanced_table_seq_gen", strategy = "org.hibernate.id.enhanced.TableGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "table_name", value = "lib_sequences"),
                    @org.hibernate.annotations.Parameter(name = "segment_column_name", value = "name"),
                    @org.hibernate.annotations.Parameter(name = "segment_value", value = "users_seq"),
                    @org.hibernate.annotations.Parameter(name = "value_column_name", value = "next_val")})
	@Column(name = "id")
	private Long id;
	private String regNumber;
	private String chassisNumber;
	private String make;
	private String model;
	private String year;
	private String colour;
	private Date registeredDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
	
	
	public Vehicle() {
		
	}
	public Vehicle(String regNumber, String chassisNumber, String make, String model, String year, String colour,
			Date registeredDate) {
		super();
		this.regNumber = regNumber;
		this.chassisNumber = chassisNumber;
		this.make = make;
		this.model = model;
		this.year = year;
		this.colour = colour;
		this.registeredDate = registeredDate;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", regNumber=" + regNumber + ", chassisNumber=" + chassisNumber + ", make=" + make
				+ ", model=" + model + ", year=" + year + ", colour=" + colour + ", registeredDate=" + registeredDate
				+ "]";
	}
	
}
