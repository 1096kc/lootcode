/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 25 23:47:30 GMT 2019
 */

package src.evo.com.kechen.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.kechen.domain.Company;
import com.kechen.domain.Problem;
import com.kechen.repository.CompanyRepository;
import com.kechen.repository.ProblemRepository;
import com.kechen.service.ProblemService;
import java.util.List;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProblemService_ESTest extends ProblemService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProblemService problemService0 = new ProblemService();
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "companyRepository", (Object) companyRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(problemRepository0).findAllByTag(anyString());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "problemRepository", (Object) problemRepository0);
      Injector.validateBean(problemService0, (Class<?>) ProblemService.class);
      List<Problem> list0 = problemService0.getProblemByTag("8QD|N`xiJ~vRWg");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ProblemService problemService0 = new ProblemService();
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "companyRepository", (Object) companyRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(problemRepository0).findAllByDifficulty(anyInt());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "problemRepository", (Object) problemRepository0);
      Injector.validateBean(problemService0, (Class<?>) ProblemService.class);
      List<Problem> list0 = problemService0.getProblemByDifficulty(0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ProblemService problemService0 = new ProblemService();
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "companyRepository", (Object) companyRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(problemRepository0).findAll();
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "problemRepository", (Object) problemRepository0);
      Injector.validateBean(problemService0, (Class<?>) ProblemService.class);
      List<Problem> list0 = problemService0.getAllProblems();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ProblemService problemService0 = new ProblemService();
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "companyRepository", (Object) companyRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      doReturn("com.kechen.domain.User_Problem").when(problemRepository0).save(nullable(Problem.class));
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "problemRepository", (Object) problemRepository0);
      Injector.validateBean(problemService0, (Class<?>) ProblemService.class);
      Problem problem0 = mock(Problem.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        problemService0.Insert(problem0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.kechen.domain.Problem
         //
         verifyException("com.kechen.repository.ProblemRepository$MockitoMock$230063980", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ProblemService problemService0 = new ProblemService();
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "companyRepository", (Object) companyRepository0);
      Problem problem0 = mock(Problem.class, new ViolatedAssumptionAnswer());
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      doReturn(problem0).when(problemRepository0).save(nullable(Problem.class));
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "problemRepository", (Object) problemRepository0);
      Injector.validateBean(problemService0, (Class<?>) ProblemService.class);
      boolean boolean0 = problemService0.Insert((Problem) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ProblemService problemService0 = new ProblemService();
      Company company0 = mock(Company.class, new ViolatedAssumptionAnswer());
      doReturn((Set) null).when(company0).getPcSet();
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      doReturn(company0).when(companyRepository0).findByCompanyName(anyString());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "companyRepository", (Object) companyRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "problemRepository", (Object) problemRepository0);
      Injector.validateBean(problemService0, (Class<?>) ProblemService.class);
      // Undeclared exception!
      try { 
        problemService0.getProblemByCompanyName("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.kechen.service.ProblemService", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ProblemService problemService0 = new ProblemService();
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "companyRepository", (Object) companyRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "problemRepository", (Object) problemRepository0);
      Injector.validateBean(problemService0, (Class<?>) ProblemService.class);
      problemService0.deleteProblemById(261);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ProblemService problemService0 = new ProblemService();
      CompanyRepository companyRepository0 = mock(CompanyRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "companyRepository", (Object) companyRepository0);
      ProblemRepository problemRepository0 = mock(ProblemRepository.class, new ViolatedAssumptionAnswer());
      Injector.inject(problemService0, (Class<?>) ProblemService.class, "problemRepository", (Object) problemRepository0);
      Injector.validateBean(problemService0, (Class<?>) ProblemService.class);
      problemService0.deleteProblem((Problem) null);
  }
}
