package failed_testcases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import ListenerNg.Retry_analyzer;

public class annot_trans implements IAnnotationTransformer {
	public void transform (ITestAnnotation annotation,Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(retry_impl.class);
	
	}
}
