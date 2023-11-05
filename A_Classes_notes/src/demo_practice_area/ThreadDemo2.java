package demo_practice_area;

import java.util.Date;

public class ThreadDemo2 {
	public static void main(String[] args) {
		VaccinationCenter vc=new VaccinationCenter();
		Thread t = Thread.currentThread();
		t.setName("imran");
		System.out.println(new Date());
		System.out.println(" Before coming to the class...");
		Thread kala=new Thread(new JobToKala (vc),"kala");
		kala.start();
		System.out.println("Take class from 7am to 9am...");
		
	}

}
class JobToKala implements Runnable{
	VaccinationCenter vc;
	public JobToKala(VaccinationCenter vc) {
		this.vc=vc;
	}
	@Override
	public void run() {
		System.out.println(" The job given to kala is executed in this method...");
		try {
			vc.getToken();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
class VaccinationCenter{
	public void getToken()throws Exception
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"... is standing in queue for the token...");
		Thread.sleep(10000);
		System.out.println(" Token received "+new Date());
		
	}
}
