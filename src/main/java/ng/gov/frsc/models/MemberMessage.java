package ng.gov.frsc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="member_message", schema = "frsc")
public class MemberMessage {
	 //@GeneratedValue
	   // @Id
	    //private Long id;
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
	    
	    @NotNull
	    @Size(min = 3, max = 100, message = "Subject must at least 3 characters.")
	    private String subject;
	    
	    @Size(min = 2, message = "Messages must be at least 2 characters")
	    private String text;
	    
        public MemberMessage() {
        	
        }
		
	    public MemberMessage(String subject, String text) {
			super();
			this.subject = subject;
			this.text = text;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public Long getId() {
			return id;
		}
	    
	    
	    

}
