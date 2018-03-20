package ng.gov.frsc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class MemberMessage {
	 @GeneratedValue
	    @Id
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
