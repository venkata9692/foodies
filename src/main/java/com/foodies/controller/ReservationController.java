package com.foodies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.foodies.form.ReservationForm;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

	@GetMapping
	public String showReservationForm() {
		return "reservation";
	}

	@PostMapping
	public String doReservation(@ModelAttribute("reservationForm") ReservationForm form, ModelMap model) {
		model.addAttribute("person", form.getName());
		return "reservation-success";
	}

}
