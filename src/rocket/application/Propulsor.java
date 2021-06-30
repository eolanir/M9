package rocket.application;

public class Propulsor extends Thread{
	
	protected int id;
	protected String rocket;
	protected int potenciaMax;
	protected int potenciaAct;
	protected int potenciaObj;
	
	public Propulsor(int potencia, int id, String rocket) {
		potenciaMax = potencia;
		potenciaAct = 0;
		potenciaObj = 80;
		this.id = id;
		this.rocket = rocket;
	}

	public int getPotenciaAct() {
		return potenciaAct;
	}

	public int getPotenciaObj() {
		return potenciaObj;
	}

	public int getPotenciaMax() {
		return potenciaMax;
	}
	
	public void setObj(int obj) {
		if(obj <= potenciaMax && obj >= 0) {
			potenciaObj = obj;
		} else if (obj > potenciaMax){
			potenciaObj = potenciaMax;
		} else if (obj < 0) {
			potenciaObj = 0;
		}
		
	}
	
	public void run() {
		while(potenciaAct != potenciaObj) {
			if(potenciaAct < potenciaObj) {
				potenciaAct++;
			} else if (potenciaAct > potenciaObj) {
				potenciaAct--;
			}
			System.out.println(rocket + " " + id + ": " + potenciaAct + " [Obj: " + potenciaObj + "]"); 
			
		}
	}
	

}
