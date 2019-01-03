package com.pwc.java.service.impl;

import java.util.LinkedList;
import java.util.List;

import com.pwc.java.service.HeroPlayService;
import com.pwc.java.service.HeroWeaponService;

public class HeroPlayServiceImpl implements HeroPlayService {

	private List<HeroWeaponService> weaponServices = new LinkedList<HeroWeaponService>();

	public void direction() {
		System.out.println("### This is a tank type hero. ###");
		System.out.println("### It is better to be a pioneer. ###");
	}

	public void play() {
		System.out.println("控制并眩晕");
		System.out.println("攻击力不高");
		for (HeroWeaponService weaponService : weaponServices) {
			weaponService.direction();
			weaponService.weapon();
		}
	}

	public void addWeapon(HeroWeaponService weaponService) {

		this.weaponServices.add(weaponService);

	}

	public void removeWeapon(HeroWeaponService weaponService) {
		this.weaponServices.remove(weaponService);
	}

}
