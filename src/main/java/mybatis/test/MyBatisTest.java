package mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import mybatis.dao.EmployMapper;
import mybatis.pojo.Employ;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


public class MyBatisTest {

    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void test() throws IOException {

        // sql的唯一标识：statement Unique identifier matching the statement to use.
        // 执行sql要用的参数：parameter A parameter object to pass to the statement.
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            Employ employ = openSession.selectOne(
                    "mybatis.dao.EmployMapper.getEmpById", 1);
            System.out.println(employ);
        } finally {
            openSession.close();
        }

    }

    @Test
    public void test01() throws IOException {
        // 1、获取sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 2、获取sqlSession对象
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            // 3、获取接口的实现类对象
            //会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
            EmployMapper mapper = openSession.getMapper(EmployMapper.class);
            Employ employ = mapper.getEmpById(1);
            System.out.println(mapper.getClass());
            System.out.println(employ);
        } finally {
            openSession.close();
        }

    }

}