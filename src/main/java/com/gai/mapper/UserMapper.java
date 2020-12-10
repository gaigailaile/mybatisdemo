package com.gai.mapper;

import com.gai.entity.User;
import com.gai.entity.Users;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserMapper {
    @Select("select * from users")
    public List<User> getAll();

    @Select("select * from users")
    @Results({
        @Result(column = "id",property= "ids",jdbcType = JdbcType.INTEGER,id = true),
        @Result(column = "name",property = "names",jdbcType = JdbcType.VARCHAR),
        @Result(column = "age",property = "ages",jdbcType = JdbcType.INTEGER)
    })
    public List<Users> getUsersAll();

    @Select("select * from users where id = #{id}")
    public User getById(int id);

    @Select("select * from users where id = #{id}")
    public User get(@Param("id") int id, String name);

    @Insert("insert into users(name,age) values(#{name},#{age})")
    public void insertUser(User user);

    @Update("update users set name=#{name},age=#{age} where id = #{id}")
    public void update(User user);

    @Delete("delete from users where id = #{id}")
    public void deleteUser(User user);

    public User getUser(int id);

    public void addUser(User user);

    public void delUser(int id);

    public void updateUser(User user);

    @Select("select * from users")
    @Results(id = "1",value = {
            @Result(column = "id",property= "ids",jdbcType = JdbcType.INTEGER,id = true),
            @Result(column = "name",property = "names",jdbcType = JdbcType.VARCHAR),
            @Result(column = "age",property = "ages",jdbcType = JdbcType.INTEGER)
    })
    public List<Users> getUsers();

    @Select("select * from users limit 1")
    @ResultMap("1")
    public Users getOne();

    @Insert("insert into users(name,age) values(#{names},#{ages})")
    @SelectKey(keyColumn = "id",keyProperty = "ids",before = false,resultType =Integer.class,statement = {" select last_insert_id()"})
    public void insert(Users users);
}
