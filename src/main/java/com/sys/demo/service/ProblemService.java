package com.sys.demo.service;

import java.util.Date;
import java.util.List;

import com.sys.demo.pojo.Problem;

public interface ProblemService {
	public boolean addProblem(Problem problem) throws Exception;
	public  List<Problem> getAllProblem() throws Exception;
	public  List<Problem> getAllProblem1() throws Exception;
	public  List<Problem> getAllProblem2() throws Exception;
	 public boolean updateProblem(Problem problem) throws Exception;
	 public  List<Problem> getWork(String unumber) throws Exception;
	 public  List<Problem> getWork1(String unumber) throws Exception;
	 public boolean updateProblem1(Problem problem) throws Exception;
	 public  List<Problem> getProblemByTime(Date  etime) throws Exception;
	 public  List<Problem> getProblemByTime1(Date  etime) throws Exception;
	 public  List<Problem> getProblemByTime2(Date  etime) throws Exception;
	 public boolean updateProblem2(Problem problem) throws Exception;
	 public boolean del(int pid) throws Exception;
}
