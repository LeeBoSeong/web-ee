package com.ee.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ee.service.MoviInfoService;
import com.ee.service.impl.MoviInfoServiceImpl;
import com.ee.vo.MovieInfoVO;
import com.google.gson.Gson;


@WebServlet("/movie-info/*")
public class MovieInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MoviInfoService miService = new MoviInfoServiceImpl();
	private Gson gson = new Gson();
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		int idx = uri.lastIndexOf("/");
		uri = uri.substring(idx+1);
		String json = "";
		if("list".equals(uri)) {
			response.setContentType("application/json;charset=UTF-8");
			json = gson.toJson(miService.selectMovieInfoList(null));
			System.out.println(json);
			PrintWriter out = response.getWriter();
			out.print(json);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
