/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 25 23:48:42 GMT 2019
 */

package com.kechen.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import com.kechen.domain.ProblemCode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProblemCode_ESTest extends ProblemCode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProblemCode problemCode0 = new ProblemCode();
      assertEquals(0, problemCode0.problemId);
  }
}