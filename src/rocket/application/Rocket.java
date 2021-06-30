package rocket.application;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
	protected String id;
	protected List<Propulsor> propulsors = new ArrayList<Propulsor>();
	protected double speed;
	
	public Rocket(String id) {
		this.id = id;
	}
	
	public void addPropulsor(int potencia) {
			Propulsor propulsor = new Propulsor(potencia, propulsors.size()+1, id);
			propulsors.add(propulsor);
		
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Rocket [id=" + id + ", propulsors=" + propulsors.size() + "] \nPotencia màxima: [" + propulsorsMax() + "]";
	}
	
	public String propulsorsMax() {
		String t = "";
		for(Propulsor i : propulsors) {
			t = t + i.getPotenciaMax() + " ";
		}
		
		return t;
	}
	
	public void accelerar(int obj) {
		for(Propulsor i : propulsors) {
			i.setObj(i.getPotenciaObj()+obj);
			i.start();
		}
	}
	
	public void frenar(int obj) {
		for(Propulsor i : propulsors) {
			i.setObj(i.getPotenciaObj()-obj);
			i.start();
		}
	}
	
	public void setSpeed(int potenciaTotal) {
		speed = 100 * Math.sqrt(potenciaTotal);
	}
	
}
