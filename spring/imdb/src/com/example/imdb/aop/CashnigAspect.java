package com.example.imdb.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CashnigAspect {

//	@Around("execution(* com.example.imdb.service.business.InMemoryMovieService.findBy.*(..))")
//	@Before("")
//	@After("")
//	@AfterReturning("")
//	@AfterThrowing("")
	@Around("""
	  imdbPackage() &&  
	     ( 
	       methodIsProfilingAnnotated() || 
	       classIsProfilingAnnotated() 
	     )
	""")
	public Object profile(ProceedingJoinPoint pjp) throws Throwable {
		var start = System.nanoTime();
		var result = pjp.proceed();
		var stop = System.nanoTime();
		var duration = stop - start;
		System.out.println(String.format("%s runs %d ns.", 
				pjp.getSignature().getName(), duration));
		return result; 
	}
	
	@Pointcut("@annotation(com.example.imdb.aop.Caching)")
	public void methodIsCachingAnnotated() {}
	
	@Pointcut("within(@com.example.imdb.service.Profiling *)")
	public void classIsCachingAnnotated() {}

	@Pointcut("execution( * com.example.imdb..*(..))")
	public void imdbPackage() {}
		
}