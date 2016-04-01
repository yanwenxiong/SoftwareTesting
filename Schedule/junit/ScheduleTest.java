import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Before;
import org.junit.Test;


public class ScheduleTest {
	private Schedule schedule;
	
	@Before 
	public void setUp(){
		schedule = new Schedule();
	}
	
	@Test
	public void test1() {
		Work work1 = new Work("work1", 0, 2);
		Work work2 = new Work("work2", 1, 2);
		Work work3 = new Work("work3", 3, 2);
		List<Work> works = new ArrayList<Work>();
		works.add(work1); works.add(work2); works.add(work3);
		
		List<Double> result = new ArrayList<Double>();
		result.add(new Double(8/3));
		result.add(new Double(4/3));
		schedule.FCFS(works);
		
		List<Double> res = schedule.FCFS(works);
		assertEquals(2.6666666666666665, (double)res.get(0),0);
		assertEquals(1.3333333333333333, (double)res.get(1),0);
	}
	
	@Test
	public void test2(){
		Work work1 = new Work("work1", 0, 2);
		Work work2 = new Work("work2", 0, 1);
		Work work3 = new Work("work3", 1, 1);
		List<Work> works = new ArrayList<Work>();
		works.add(work1); works.add(work2); works.add(work3);
		
		List<Double> result = new ArrayList<Double>();
		result.add(new Double(2));
		result.add(new Double(4/3));

		List<Double> res = schedule.SJF(works);
		assertEquals(2, (double)res.get(0),0);
		assertEquals(1.3333333333333333, (double)res.get(1),0);
	}
	
	@Test
	public void test3(){
		Work work1 = new Work("work1", 0, 2);
		Work work2 = new Work("work2", 0, 3);
		Work work3 = new Work("work3", 2, 2);
		Work work4 = new Work("work4", 3, 1);
		List<Work> works = new ArrayList<Work>();
		works.add(work1); works.add(work2); works.add(work3); works.add(work4);
		
		List<Double> result = new ArrayList<Double>();
		result.add(new Double(7/2));
		result.add(new Double(5/3));
		
		List<Double> res = schedule.SJF(works);
		assertEquals(3.5, (double)res.get(0),0);
		assertEquals(1.6666666666666665, (double)res.get(1),0);
	}
	
	@Test
	public void test4(){
		Work work1 = new Work("work1", 0, 2);
		Work work2 = new Work("work2", 3, 1);
		List<Work> works = new ArrayList<Work>();
		works.add(work1); works.add(work2);
		
		List<Double> result = new ArrayList<Double>();
		result.add(new Double(3/2));
		result.add(new Double(1));
		
		List<Double> res = schedule.SJF(works);
		assertEquals(1.5, (double)res.get(0),0);
		assertEquals(1, (double)res.get(1),0);
	}

}
