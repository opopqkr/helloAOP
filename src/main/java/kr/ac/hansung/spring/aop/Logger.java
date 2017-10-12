package kr.ac.hansung.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect

public class Logger {

	@Pointcut("execution( void kr.ac.hansung.spring.aop.*.sound())")
	private void selectSound(){ //signature
		
	}
	
	@After("selectSound()")
	public void aboutToSound(){
		System.out.println("before advice: about to sound() ");
	}
}
