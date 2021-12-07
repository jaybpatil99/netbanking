package MyMavenProject2;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingPractice {
@Test(groups="sanity")
public void method1() {
	System.out.println("Method1");
}
@Test(groups="regression")
public void method2() {
	System.out.println("Method2");

}
@Test(groups="smoke")
public void method3() {
	System.out.println("Method3");
}
@Test(groups={"sanity","regression"})
public void method4() {
	System.out.println("Method4");
}
@Test(groups={"sanity","smoke"})
public void method5() {
	System.out.println("Method5");
}
}
