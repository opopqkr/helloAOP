package kr.ac.hansung.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	@Autowired // AnimalType을 가진 Bean이 주입이됨 
	           // ex)dog, cat이 두개있으면 모호해서 주입이 되지 않음
			   // 구체적으로 둘중 하나를 주입시켜야 함
	@Qualifier(value="qf_dog") // 모호한 bean을 지정 
	private AnimalType animal;
	
	/*
	public PetOwner(AnimalType animal) {
		super();
		this.animal = animal;
	}*/
	
	public void play() {
		animal.sound();
	}

}
