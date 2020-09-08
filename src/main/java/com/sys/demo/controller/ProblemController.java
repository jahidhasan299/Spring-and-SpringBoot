package com.sys.demo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sys.demo.pojo.Problem;
import com.sys.demo.service.ProblemService;

@Controller
public class ProblemController {
	@Autowired
	private ProblemService problemService;
	@RequestMapping("/addProblem")
	@ResponseBody
	public boolean addProblem( Problem problem){
		boolean flag = true;
		try {
			flag = problemService.addProblem(problem);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/getAllProblem")
	@ResponseBody
	public List<Problem> getAllProblem(Problem problem){
		List<Problem> list = new ArrayList<Problem>();
		try {
			list = problemService.getAllProblem();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/getAllProblem2")
	@ResponseBody
	public List<Problem> getAllProblem2(Problem problem){
		List<Problem> list = new ArrayList<Problem>();
		try {
			list = problemService.getAllProblem2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/getAllProblem1")
	@ResponseBody
	public List<Problem> getAllProblem1(Problem problem){
		List<Problem> list = new ArrayList<Problem>();
		try {
			list = problemService.getAllProblem1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/updateProblem")
	@ResponseBody
	public boolean updateProblem(Problem problem){
		boolean flag = false;
		try {
			 flag = problemService.updateProblem(problem);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/getWork")
	@ResponseBody
	public List<Problem> getWork(String unumber){
		List<Problem> list = new ArrayList<Problem>();
		try {
			list = problemService.getWork(unumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/getWork1")
	@ResponseBody
	public List<Problem> getWork1(String unumber){
		List<Problem> list = new ArrayList<Problem>();
		try {
			list = problemService.getWork1(unumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/updateProblem1")
	@ResponseBody
	public boolean updateProblem1(Problem problem){
		boolean flag = false;
		try {
			 flag = problemService.updateProblem1(problem);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/getProblemByTime")
	@ResponseBody
	public List<Problem> getProblemByTime(String etime) throws ParseException{
		SimpleDateFormat s =new SimpleDateFormat("yyyy-MM-dd");
		Date d=s.parse(etime);
		List<Problem> list = new ArrayList<Problem>();
		try {
			list = problemService.getProblemByTime(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/getProblemByTime1")
	@ResponseBody
	public List<Problem> getProblemByTime1(String etime) throws ParseException{
		SimpleDateFormat s =new SimpleDateFormat("yyyy-MM-dd");
		Date d=s.parse(etime);
		List<Problem> list = new ArrayList<Problem>();
		try {
			list = problemService.getProblemByTime1(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/getProblemByTime2")
	@ResponseBody
	public List<Problem> getProblemByTime2(String etime) throws ParseException{
		SimpleDateFormat s =new SimpleDateFormat("yyyy-MM-dd");
		Date d=s.parse(etime);
		List<Problem> list = new ArrayList<Problem>();
		try {
			list = problemService.getProblemByTime2(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@RequestMapping("/updateProblem2")
	@ResponseBody
	public boolean updateProblem2(Problem problem){
		boolean flag = false;
		try {
			 flag = problemService.updateProblem2(problem);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@RequestMapping("/del")
	@ResponseBody
	public boolean del(Integer pid){
		boolean flag = false;
		try {
			 flag = problemService.del(pid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
