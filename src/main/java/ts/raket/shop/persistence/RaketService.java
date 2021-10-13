package ts.raket.shop.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ts.raket.shop.model.Raket;
import ts.raket.shop.model.Top;

@Service
public class RaketService {
	@Autowired
	private RaketRepository rr;
	
	@Autowired
	private TopRepository tr;
	
	public Raket haalRaketMetIdOp(long id) {
		Optional<Raket> raketO= rr.findById(id);
		return raketO.get();
	}
	
	public void voegTopAanRaketToe(Top top, long raketid){
		System.out.println("ik ben in de service");
		Optional <Raket> deraket = rr.findById(raketid);
		Raket echtraket = deraket.get();
		Top temp = tr.save(top);
		echtraket.setTop(temp);
		rr.save(echtraket);
	}

}
