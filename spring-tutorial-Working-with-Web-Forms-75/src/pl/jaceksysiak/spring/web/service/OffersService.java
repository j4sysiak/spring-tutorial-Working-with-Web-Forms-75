package pl.jaceksysiak.spring.web.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.jaceksysiak.spring.web.dao.Offer;
import pl.jaceksysiak.spring.web.dao.OffersDAO;

@Service("offersService")
public class OffersService {
	
	private OffersDAO offersDao;
	
	@Autowired
	public void setOffersDao(OffersDAO offersDao) {
		this.offersDao = offersDao;
	}

	public List<Offer> getCurrent() {
		return offersDao.getOffers();
	}

	public void create(@Valid Offer offer) {
		 
		offersDao.create(offer);
	}

	public void throwTestException() {
		
		offersDao.getOffer(9999);
		
	}
}



































