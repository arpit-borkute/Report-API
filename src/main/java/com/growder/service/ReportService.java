package com.growder.service;

import java.util.List;

import com.growder.request.SearchRequest;
import com.growder.response.SearchResponse;

import jakarta.servlet.http.HttpServletResponse;

public interface ReportService {

	public List<String> getUniquePlanNames();

	public List<String> getUniquePlanStatuses();

	public List<SearchResponse> search(SearchRequest request);

	public void generateExcel(HttpServletResponse response) throws Exception;

	public void generatePdf(HttpServletResponse response) throws Exception;

}
