package com.sys.demo.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.demo.dao.ProblemDao;
import com.sys.demo.pojo.Problem;
import com.sys.demo.service.ProblemService;
@Service
public class ProblemServiceImpl implements ProblemService{
	@Autowired
	private ProblemDao problemDao;
	@Override
	public boolean addProblem(Problem problem) throws Exception {
		boolean flag = true;
		problem.setEtime(new Date());
		int num = problemDao.addProblem(problem);
		if(num != 1){
			flag = false;
		}
		return flag;
	}
	@Override
	public List<Problem> getAllProblem() throws Exception {
		List<Problem> list=problemDao.getAllProblem();
		return list;
	}
	@Override
	public boolean updateProblem(Problem problem) throws Exception {
		boolean flag = false;
		int num = problemDao.updateProblem(problem);
		if(num ==1 ){
			flag = true;
		}
		return flag;
	}
	@Override
	public List<Problem> getWork(String unumber) throws Exception {
		List<Problem> list=problemDao.getWork(unumber);
		return list;
	}
	@Override
	public List<Problem> getWork1(String unumber) throws Exception {
		List<Problem> list=problemDao.getWork1(unumber);
		return list;
	}
	@Override
	public boolean updateProblem1(Problem problem) throws Exception {
		boolean flag = false;
		int num = problemDao.updateProblem1(problem);
		if(num ==1 ){
			flag = true;
		}
		return flag;
	}
	@Override
	public List<Problem> getProblemByTime(Date etime) throws Exception {
		List<Problem> list=problemDao.getProblemByTime(etime);
		return list;
	}
	@Override
	public List<Problem> getProblemByTime1(Date etime) throws Exception {
		List<Problem> list=problemDao.getProblemByTime1(etime);
		return list;
	}
	@Override
	public List<Problem> getProblemByTime2(Date etime) throws Exception {
		List<Problem> list=problemDao.getProblemByTime2(etime);
		return list;
	}
	@Override
	public boolean updateProblem2(Problem problem) throws Exception {
		boolean flag = false;
		int num = problemDao.updateProblem2(problem);
		if(num ==1 ){
			flag = true;
		}
		return flag;
	}
	@Override
	public List<Problem> getAllProblem1() throws Exception {
		List<Problem> list=problemDao.getAllProblem1();
		return list;
	}
	@Override
	public List<Problem> getAllProblem2() throws Exception {
		List<Problem> list=problemDao.getAllProblem2();
		return list;
	}
	@Override
	public boolean del(int pid) throws Exception {
		boolean flag = false;
		int num = problemDao.del(pid);
		if(num ==1 ){
			flag = true;
		}
		return flag;
	}
	
}
