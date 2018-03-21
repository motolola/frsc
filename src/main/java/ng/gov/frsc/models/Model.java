package ng.gov.frsc.models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class Model {
    //@GeneratedValue
    //@Id
    //private Long id;
	
	@Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "enhanced_table_seq_gen")
    @GenericGenerator(name = "enhanced_table_seq_gen", strategy = "org.hibernate.id.enhanced.TableGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "table_name", value = "lib_sequences"),
                    @org.hibernate.annotations.Parameter(name = "segment_column_name", value = "name"),
                    @org.hibernate.annotations.Parameter(name = "segment_value", value = "users_seq"),
                    @org.hibernate.annotations.Parameter(name = "value_column_name", value = "next_val")})
    private Long id;

    private Date dateCreated;

    @Version
    private Timestamp dateModified;

    @PrePersist
    void createdAt() {
        this.setDateCreated(new Date());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Timestamp getDateModified() {
        return dateModified;
    }

    public void setDateModified(Timestamp dateModified) {
        this.dateModified = dateModified;
    }
}
