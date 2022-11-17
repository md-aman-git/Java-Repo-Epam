package com.epam.partsmgmt.service;

import java.util.List;

import com.epam.partsmgmt.vo.PartVO;

public interface PartService {
	public PartVO findPartById(int id);
	public List<PartVO> findAll();
	public void savePart(PartVO partVO);
	public void updatePart(PartVO partVO);
	public void deletePartById(int id);
}
