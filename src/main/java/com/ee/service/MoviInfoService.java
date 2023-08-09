package com.ee.service;

import java.util.List;

import com.ee.vo.MovieInfoVO;

public interface MoviInfoService {
	List<MovieInfoVO> selectMovieInfoList (MovieInfoVO movieList);
}
