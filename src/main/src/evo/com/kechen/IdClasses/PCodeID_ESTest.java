/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 25 23:51:14 GMT 2019
 */

package com.kechen.IdClasses;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.kechen.IdClasses.PCodeID;
import com.kechen.domain.Code;
import com.kechen.domain.Problem;
import com.kechen.domain.User;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PCodeID_ESTest extends PCodeID_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      User user0 = mock(User.class, new ViolatedAssumptionAnswer());
      PCodeID pCodeID0 = new PCodeID((Problem) null, (Code) null, user0);
      PCodeID pCodeID1 = new PCodeID();
      boolean boolean0 = pCodeID0.equals(pCodeID1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Code code0 = mock(Code.class, new ViolatedAssumptionAnswer());
      User user0 = mock(User.class, new ViolatedAssumptionAnswer());
      PCodeID pCodeID0 = new PCodeID((Problem) null, code0, user0);
      PCodeID pCodeID1 = new PCodeID();
      boolean boolean0 = pCodeID0.equals(pCodeID1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Problem problem0 = mock(Problem.class, new ViolatedAssumptionAnswer());
      Code code0 = mock(Code.class, new ViolatedAssumptionAnswer());
      User user0 = mock(User.class, new ViolatedAssumptionAnswer());
      PCodeID pCodeID0 = new PCodeID(problem0, code0, user0);
      PCodeID pCodeID1 = new PCodeID();
      boolean boolean0 = pCodeID1.equals(pCodeID0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PCodeID pCodeID0 = new PCodeID();
      boolean boolean0 = pCodeID0.equals(pCodeID0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PCodeID pCodeID0 = new PCodeID();
      Code code0 = pCodeID0.getCode();
      assertNull(code0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PCodeID pCodeID0 = new PCodeID();
      pCodeID0.setCode((Code) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PCodeID pCodeID0 = new PCodeID();
      pCodeID0.setProblem((Problem) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PCodeID pCodeID0 = new PCodeID();
      User user0 = mock(User.class, new ViolatedAssumptionAnswer());
      pCodeID0.setUser(user0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PCodeID pCodeID0 = new PCodeID();
      User user0 = pCodeID0.getUser();
      boolean boolean0 = pCodeID0.equals(user0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PCodeID pCodeID0 = new PCodeID();
      pCodeID0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PCodeID pCodeID0 = new PCodeID();
      Problem problem0 = pCodeID0.getProblem();
      PCodeID pCodeID1 = new PCodeID(problem0, (Code) null, (User) null);
      boolean boolean0 = pCodeID0.equals(pCodeID1);
      assertTrue(boolean0);
  }
}