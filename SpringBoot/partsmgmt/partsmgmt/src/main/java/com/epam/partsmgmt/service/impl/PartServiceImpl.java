package com.epam.partsmgmt.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.partsmgmt.entity.Part;
import com.epam.partsmgmt.repo.PartRepo;
import com.epam.partsmgmt.service.PartService;
import com.epam.partsmgmt.vo.PartVO;

@Service
public class PartServiceImpl implements PartService {

	@Autowired
	PartRepo partRepo;
	@Override
	public PartVO findPartById(int id) {
		// TODO Auto-generated method stub
		PartVO partVO = new PartVO();
		Part part = partRepo.findById(id);
		partVO.setId(part.getId());
		partVO.setName(part.getName());
		partVO.setCategory(part.getCategory());
		return partVO;
	}
	@Override
	public List<PartVO> findAll() {
		// TODO Auto-generated method stub
		List<PartVO> partsVO = new ArrayList<PartVO>();
		List<Part> parts = partRepo.findAll();
		for(Part part : parts) {
			PartVO partVO = new PartVO();
			partVO.setId(part.getId());
			partVO.setName(part.getName());
			partVO.setCategory(part.getCategory());
			partsVO.add(partVO);
		}
		return partsVO;
	}
	@Override
	public void savePart(PartVO partVO) {
		// TODO Auto-generated method stub
		Part part = new Part();
		part.setName(partVO.getName());
		part.setCategory(partVO.getCategory());
		partRepo.save(part);
	}
	@Override
	public void deletePartById(int id) {
		// TODO Auto-generated method stub
		partRepo.deleteById(id);
	}
	@Override
	public void updatePart(PartVO partVO) {
		// TODO Auto-generated method stub
		Part part = new Part();
		part.setId(partVO.getId());
		part.setName(partVO.getName());
		part.setCategory(partVO.getCategory());
		partRepo.save(part);
	}

}
