package com.pwc.java.service;

public interface HeroPlayService extends CommonService {
	/**
	 * This method to show one hero how to play
	 */
	public void play();

	public void addWeapon(HeroWeaponService weaponService);

	public void removeWeapon(HeroWeaponService weaponService);

}
