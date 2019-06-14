/**
 *  PRACTICA 1
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.Client;
import ubu.gii.dass.c01.DuplicatedInstanceException;
import ubu.gii.dass.c01.NotFreeInstanceException;
import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.ReusablePool;

/**
 * @author Carolina
 *
 */
public class ReusablePoolTest {

	private ReusablePool pool;
	Reusable elemento = new Reusable();
	Client cliente = new Client();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		pool = ReusablePool.getInstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		pool = null;
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		ReusablePool pool = ReusablePool.getInstance();

		// No es nulo
		assertNotNull(pool);

		// El objeto devuelto es instancia de ReusablePool
		assertTrue(pool instanceof ReusablePool);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 * 
	 * @throws NotFreeInstanceException
	 */
	@Test
	public void testAcquireReusable() throws NotFreeInstanceException {
		// Creación de objeto Reusable que nos indicara cuando no existen más
		// objetos Reusable
		Reusable flag = pool.acquireReusable();
		try {
			while (flag != null) {
				flag = pool.acquireReusable();
			}
		} catch (NotFreeInstanceException e) {
			System.err.println(e);
		}
	}

	/**
	 * Test method for
	 * {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}
	 * .
	 * 
	 * @throws NotFreeInstanceException
	 */
	@Test
	public void testReleaseReusable() throws NotFreeInstanceException {
		boolean excep = false;
		boolean release = false;
		ReusablePool rp = ReusablePool.getInstance();
		Reusable r = null;
		try {
			r = rp.acquireReusable();
		} catch (NotFreeInstanceException e) {
			assertTrue(false);
		}
		try {
			rp.releaseReusable(r);
			release = true;
			rp.releaseReusable(r);
		} catch (DuplicatedInstanceException e) {
			excep = true;
		}
		assertTrue(release);
		assertTrue(excep);
	}

}
