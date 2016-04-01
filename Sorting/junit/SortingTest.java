import static org.junit.Assert.*;

import org.junit.Test;


public class SortingTest {
	Sorting sort=new Sorting();
	int []a = {10,2,6,1,11,4,-1,8,15,5,0,7};
	int []d = {1,2,4,1,11,4,-16,8,5,5,0,7};
	int []e={5,5,5,5,5,3,1,1,1,1,1};
	int []b = {-1,1,2,4,6,8};
	Object []c={1,5,2};
	@Test
	public void testInsertionSort() {
		sort.insertionSort(a);
	}

	@Test
	public void testIsSorted() {
		assertEquals(false,sort.isSorted(a));
		assertEquals(true,sort.isSorted(b));
	}

	@Test
	public void testQuicksort() {
		sort.quicksort(a);
		sort.quicksort(d);
		sort.quicksort(e);
	}

	@Test
	public void testSwapReferences() {
		sort.swapReferences(c, 1,2);
	}

	@Test
	public void testSwap() {
		sort.swap(a, 1, 2);
	}

}
