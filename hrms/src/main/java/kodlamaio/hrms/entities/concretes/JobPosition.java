package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="job_positions")
@Data
public class JobPosition {
	@Id
	@GeneratedValue
	@Column(name="jop_positions_id")
	private int id;
	
	@Column(name="jop_positions_position")
	private String position;
}
