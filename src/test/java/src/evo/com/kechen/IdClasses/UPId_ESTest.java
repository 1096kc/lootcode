/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 25 23:46:35 GMT 2019
 */

package src.evo.com.kechen.IdClasses;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.kechen.IdClasses.UPId;
import com.kechen.domain.Problem;
import com.kechen.domain.User;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UPId_ESTest extends UPId_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UPId uPId0 = new UPId();
      boolean boolean0 = uPId0.equals(uPId0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UPId uPId0 = new UPId();
      boolean boolean0 = uPId0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UPId uPId0 = new UPId();
      User user0 = mock(User.class, new ViolatedAssumptionAnswer());
      uPId0.setUser(user0);
      UPId uPId1 = new UPId();
      boolean boolean0 = uPId0.equals(uPId1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UPId uPId0 = new UPId();
      Problem problem0 = uPId0.getProblem();
      assertNull(problem0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UPId uPId0 = new UPId();
      Problem problem0 = mock(Problem.class, new ViolatedAssumptionAnswer());
      uPId0.setProblem(problem0);
      User user0 = uPId0.getUser();
      UPId uPId1 = new UPId(user0, (Problem) null);
      boolean boolean0 = uPId0.equals(uPId1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UPId uPId0 = new UPId();
      uPId0.hashCode();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UPId uPId0 = new UPId();
      User user0 = uPId0.getUser();
      UPId uPId1 = new UPId(user0, (Problem) null);
      boolean boolean0 = uPId0.equals(uPId1);
      assertTrue(boolean0);
  }
}
