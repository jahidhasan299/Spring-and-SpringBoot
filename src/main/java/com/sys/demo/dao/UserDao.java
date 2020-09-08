package com.sys.demo.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sys.demo.pojo.User;

public interface UserDao {
	@Insert("insert into user(uid,uname,unumber,uphone,cardid,usex,salary,ulevel) values(#{uid},#{uname},#{unumber},#{uphone},#{cardid},#{usex},#{salary},#{ulevel})")
	public int addUser(User user) throws SQLException;
	@Select("select * from user where unumber=#{unumber}")
	public User getUserByNumber(String unumber)throws SQLException;
	@Select("select * from user where unumber=#{unumber}")
	public User getUserByNumber1(String unumber)throws SQLException;
	@Select("select * from user")
	public  List<User> getAll() throws SQLException;
	@Select("select * from user where cardid=#{cardid}")
	public User getUserByCardid(String cardid) throws SQLException;
	@Delete("delete from user where uid=#{uid}")
	public int deleteUser(int uid) throws SQLException;
	@Update("update user set uname=#{uname},password=#{password},usex=#{usex},uphone=#{uphone} where unumber=#{unumber}")
    public int updateUser(User user) throws SQLException;
	@Update("update user set salary=#{salary} where unumber=#{unumber}")
    public int updateSalary(User user) throws SQLException;
	@Update("update user set ustate=#{ustate} where unumber=#{unumber}")
    public int updateUstate(User user) throws SQLException;
	@Select("select * from user where unumber=#{unumber}")
	public User getUser(String unumber) throws SQLException;
	@Select("select password from user where unumber=#{arg0} and uphone=#{arg1}")
	public User getPassword(String unumber,String uphone) throws SQLException;
	@Select("select * from user WHERE ustate='空闲'")
	public  List<User> getAllFree() throws SQLException;
	@Update("update user set ustate='工作' where unumber=#{unumber}")
    public int updateUstate1(User user) throws SQLException;
	@Select("select *  from user where unumber=#{unumber}")
	public User getUserByNumber2(User user)throws SQLException;
	@Update("update user set salary=salary+#{salary}")
    public int updateS(User user) throws SQLException;
	@Update("update user set ustate='空闲' where unumber=#{unumber}")
	public int updateUstate2(User user) throws SQLException;
}
