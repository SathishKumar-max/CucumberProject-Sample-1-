package com.omrbranch.pagemanager;

import com.omrbranch.pages.BookHotelPage;
import com.omrbranch.pages.BookingConfirmPage;
import com.omrbranch.pages.CancelBooking;
import com.omrbranch.pages.ExploreHotelPage;
import com.omrbranch.pages.LogInPage;
import com.omrbranch.pages.MyBookingPage;
import com.omrbranch.pages.SelectHotelPage;

public class PageObjectManager {

	private LogInPage loginPage;
	private ExploreHotelPage exploreHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmPage bookingConfirmPage;
	private MyBookingPage myBookingPage;
    private CancelBooking cancelBooking;


	public LogInPage getLoginPage() {
		return (loginPage==null)? loginPage = new LogInPage():loginPage;
	}

	public ExploreHotelPage getExploreHotelPage() {
		return (exploreHotelPage==null)? exploreHotelPage = new ExploreHotelPage():exploreHotelPage;
	}

	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)? selectHotelPage = new SelectHotelPage(): selectHotelPage;
	}

	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)? bookHotelPage = new BookHotelPage(): bookHotelPage;
	}

	public BookingConfirmPage getBookingConfirmPage() {
		return (bookingConfirmPage==null)? bookingConfirmPage = new BookingConfirmPage(): bookingConfirmPage;
	}

	public MyBookingPage getMyBookingPage() {
		return (myBookingPage==null)? myBookingPage = new MyBookingPage(): myBookingPage;
	}
    public CancelBooking getCancelBooking(){
		return (cancelBooking==null)? cancelBooking = new CancelBooking(): cancelBooking;
    
    }
}
