package ts.raket.shop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ts.raket.shop.model.Raket;
import ts.raket.shop.model.Top;
import ts.raket.shop.persistence.RaketService;

@RestController
public class RaketEndpoint {
	
	@Autowired
	private RaketService rs;
	
	@GetMapping("rocketbyid/{id}")
	public Raket rocketById(@PathVariable long id) {
		// sanitisation
		System.out.println("abc");
		return rs.haalRaketMetIdOp(id);
	} 
	//
	@GetMapping("ffproberen")
	public void ffproberen() {
		long idraket = 3;
		Top top = new Top();
		rs.voegTopAanRaketToe(top , idraket);
	}
}








