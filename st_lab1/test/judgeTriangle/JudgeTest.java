package judgeTriangle;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class JudgeTest {
	private Judge judge;
	private double a;
	private double b;
	private double c;
	private String msg;
	
	public JudgeTest(double a,double b,double c,String msg) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.msg = msg;
	}
	
	@Before
	public void init(){
		judge = new Judge();
	}
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
				{1,2,4,"not a triangle"},
				{2,4,3,"scalene"},
				{2,2,2,"equilateral"},
				{2,3,3,"isosceles"},
				{2,2,3,"isosceles"}
		});
	}
	@Test
	public void testJudge(){
		//double[] list = new double[]{this.a,this.b,this.c};
		assertEquals(this.msg, judge.judge(new double[]{a,b,c}));
	}
	/*@Test(timeout=100)
	public void testTimeOut(){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

	
	
}
