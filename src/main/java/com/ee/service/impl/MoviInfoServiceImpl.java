package com.ee.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ee.common.MybatisSqlSessionFactory;
import com.ee.mapper.MovieInfoMapper;
import com.ee.service.MoviInfoService;
import com.ee.vo.MovieInfoVO;

public class MoviInfoServiceImpl implements MoviInfoService {
	private SqlSessionFactory ssf = MybatisSqlSessionFactory.getSqlSessionFactory();

	@Override
	public List<MovieInfoVO> selectMovieInfoList(MovieInfoVO movieList) {
		try (SqlSession session = ssf.openSession()) {
			MovieInfoMapper movieInfo = session.getMapper(MovieInfoMapper.class);
			return movieInfo.selectMovieInfoList(null);
		} catch (Exception e) {
			throw e;
		}
	}

}
