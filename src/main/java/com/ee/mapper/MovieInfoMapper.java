package com.ee.mapper;

import java.util.List;

import com.ee.vo.MovieInfoVO;

public interface MovieInfoMapper {
	List<MovieInfoVO> selectMovieInfoList (MovieInfoVO movieList);
}
