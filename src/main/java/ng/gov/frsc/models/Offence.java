package ng.gov.frsc.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Offence {
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
	private String infringement;
	private String code;
	private int points;
	private double penalty;
	private int category;
	private Date expiryDate;
	
	public Offence(Long id, String infringement, String code, int points, double penalty, int category, Date expiryDate,
			List<User> users) {
		super();
		this.id = id;
		this.infringement = infringement;
		this.code = code;
		this.points = points;
		this.penalty = penalty;
		this.category = category;
		this.expiryDate = expiryDate;
		this.users = users;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@ManyToMany(mappedBy = "offences")
    private List<User> users = new ArrayList<>();
	
	public Offence() {
	}
	@Override
	public String toString() {
		return "Offence [id=" + id + ", infringement=" + infringement + ", code=" + code + ", points=" + points
				+ ", penalty=" + penalty + ", category=" + category + "]";
	}
	
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInfringement() {
		return infringement;
	}
	public void setInfringement(String infringement) {
		this.infringement = infringement;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public double getPenalty() {
		return penalty;
	}
	public void setPenalty(double penalty) {
		this.penalty = penalty;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	
	

}
