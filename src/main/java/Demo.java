import com.gai.entity.User;
import com.gai.entity.Users;
import com.gai.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Demo {
//    public static void main(String[] args) {
//        String resource = "mybatis.xml";
//        Reader reader = null;
//        SqlSession sqlSession = null;
//        try {
//            //读取配置文件
//            reader = Resources.getResourceAsReader(resource);
//            //获取会话工厂
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//            //开启会话
//            sqlSession = sqlSessionFactory.openSession();
//            //调用查询api
//            User user = sqlSession.selectOne("getUser",1);
//            System.out.println(user.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            sqlSession.close();
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

//    public static void main(String[] args) {
//        String resource = "mybatis.xml";
//        Reader reader = null;
//        SqlSession sqlSession = null;
//        try {
//            //读取配置文件
//            reader = Resources.getResourceAsReader(resource);
//            //获取会话工厂
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//            //开启会话
//            sqlSession = sqlSessionFactory.openSession();
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            User user = new User();
//            user.setName("gaidongxu");
//            user.setAge(23);
//            userMapper.addUser(user);
//            sqlSession.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            sqlSession.close();
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

//    public static void main(String[] args) {
//        String resource = "mybatis.xml";
//        Reader reader = null;
//        SqlSession sqlSession = null;
//        try {
//            //读取配置文件
//            reader = Resources.getResourceAsReader(resource);
//            //获取会话工厂
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//            //开启会话
//            sqlSession = sqlSessionFactory.openSession();
//            //调用查询api
//            User user = sqlSession.selectOne("getUser",6);
//            user.setAge(26);
//            int count = sqlSession.insert("updateUser",user);
//            sqlSession.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            sqlSession.close();
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

//    public static void main(String[] args) {
//        String resource = "mybatis.xml";
//        Reader reader = null;
//        SqlSession sqlSession = null;
//        try {
//            //读取配置文件
//            reader = Resources.getResourceAsReader(resource);
//            //获取会话工厂
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//            //开启会话
//            sqlSession = sqlSessionFactory.openSession();
//            sqlSession.getMapper(UserMapper.class);
//            sqlSession.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            sqlSession.close();
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public static void main(String[] args) {
        String resource = "mybatis.xml";
        Reader reader = null;
        SqlSession sqlSession = null;
        try {
            //读取配置文件
            reader = Resources.getResourceAsReader(resource);
            //获取会话工厂
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //开启会话
            sqlSession = sqlSessionFactory.openSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            Users users = new Users();
            users.setNames("yanghui");
            users.setAges(60);

            userMapper.insert(users);
            System.out.println(users.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
