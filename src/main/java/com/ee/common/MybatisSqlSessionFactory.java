package com.ee.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ee.mapper.MovieInfoMapper;
import com.ee.vo.MovieInfoVO;

public class MybatisSqlSessionFactory {
	private static SqlSessionFactory SSF;
	private final static String CONFIG_PATH = "config/Mybatis-config.xml";
	static {
		try {
			InputStream is = Resources.getResourceAsStream(CONFIG_PATH);
			SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
			SSF = sb.build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return SSF;
	}
	
	public static void main(String[] args) {
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession();
		MovieInfoMapper movieList = session.getMapper(MovieInfoMapper.class);
		List<MovieInfoVO> movie = movieList.selectMovieInfoList(null);
		System.out.println(movie);
	}
}
