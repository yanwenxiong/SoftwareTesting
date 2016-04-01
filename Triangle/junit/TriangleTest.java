import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTest {
	private Triangle triangle;
	
	@Test
	public void test0_1r_2r_3r_a() {
		triangle = new Triangle(3,3,3);
		assertEquals(true,triangle.isTriangle(triangle));
		assertEquals("Regular",triangle.getType(triangle));
	}
	@Test
	public void test0_1r_2r_3r_b() {
		triangle = new Triangle(5,1,3);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	@Test
	public void test0_1r_2r_3r_c() {
		triangle = new Triangle(4,5,10);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	
	
	@Test
	public void test0_1r_2r_3w_a() {
		triangle = new Triangle(1,2,-3);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	@Test
	public void test0_1r_2r_3w_b() {
		triangle = new Triangle(1,2,Long.MAX_VALUE + 2);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	
	@Test
	public void test0_1r_2w_a() {
		triangle = new Triangle(1,Long.MAX_VALUE + 2,3);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	@Test
	public void test0_1r_2w_b() {
		triangle = new Triangle(1,-2,3);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	
	@Test
	public void test0_1w_a() {
		triangle = new Triangle(Long.MAX_VALUE + 2,2,3);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	@Test
	public void test0_1w_b() {
		triangle = new Triangle(-2,2,3);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	
	@Test
	public void test0_1() {
		triangle = new Triangle(-2,2,3);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	
	@Test
	public void test0_2() {
		triangle = new Triangle(-2,-3,Long.MAX_VALUE + 2);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	
	@Test
	public void test1() {
		triangle = new Triangle(-1,2,3);
		triangle.getBorders();
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	
	@Test
	public void test2() {
		triangle = new Triangle(2,-1,3);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	
	@Test
	public void test3() {
		triangle = new Triangle(3,2,-1);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	
	@Test
	public void test4() {
		triangle = new Triangle(1,2,3);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	
	@Test
	public void test5() {
		triangle = new Triangle(2,1,3);
		assertEquals(false,triangle.isTriangle(triangle));
		assertEquals("Illegal",triangle.getType(triangle));
	}
	
	@Test
	public void test6() {
		triangle = new Triangle(2,3,4);
		assertEquals(true,triangle.isTriangle(triangle));
		assertEquals("Scalene",triangle.getType(triangle));
	}

	@Test
	public void test7() {
		triangle = new Triangle(2,2,3);
		assertEquals(true,triangle.isTriangle(triangle));
		assertEquals("Isosceles",triangle.getType(triangle));
	}
	
	@Test
	public void test8() {
		triangle = new Triangle(2,3,2);
		assertEquals(true,triangle.isTriangle(triangle));
		assertEquals("Isosceles",triangle.getType(triangle));
	}
	
	@Test
	public void test9() {
		triangle = new Triangle(3,2,2);
		assertEquals(true,triangle.isTriangle(triangle));
		assertEquals("Isosceles",triangle.getType(triangle));
	}

	@Test
	public void test10() {
		triangle = new Triangle(2,2,2);
		assertEquals(true,triangle.isTriangle(triangle));
		assertEquals("Regular",triangle.getType(triangle));
	}
	
	@Test
	public void test11() {
		triangle = new Triangle(2,2,2);
		assertArrayEquals(new long[]{2,2,2},triangle.getBorders());
	}
	

}
