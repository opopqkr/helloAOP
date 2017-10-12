package kr.ac.hansung.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("/kr/ac/hansung/spring/aop/conf/animal.xml"); 
		//xml을 갖고 spirng 컨테이너 생성
		
		PetOwner person = (PetOwner) context.getBean("id_petOwner");
		//컨테이너에서 bean을 갖고옴
		
		person.play();
		
		context.close();
	}

}
