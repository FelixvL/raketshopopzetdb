package ts.raket.shop.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Raket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	/////    relatie Top 
	@OneToOne
	private Top top;
	/////	relatie Middel
	//////	relatie Bottom
	
	private String naam;
	private LocalDateTime besteldDatum;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public LocalDateTime getBesteldDatum() {
		return besteldDatum;
	}
	public void setBesteldDatum(LocalDateTime besteldDatum) {
		this.besteldDatum = besteldDatum;
	}
	public Top getTop() {
		return top;
	}
	public void setTop(Top top) {
		this.top = top;
	}
	
	

}
