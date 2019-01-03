package com.pwc;

import com.pwc.java.service.HeroPlayService;
import com.pwc.java.service.HeroWeaponService;
import com.pwc.java.service.impl.HeroPlayServiceImpl;
import com.pwc.java.service.impl.HeroWeaponServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {
    	System.out.println("Start to login.");
    	HeroWeaponService weaponService = new HeroWeaponServiceImpl();
    	HeroPlayService hero = new HeroPlayServiceImpl();
    	
    	System.out.println("Hello my hero.");
    	hero.direction();
    	hero.play();    
    	
    	System.out.println("Buy one weapon.");
    	hero.addWeapon(weaponService);
    	hero.direction();
    	hero.play();      	
    	
    	System.out.println("Sale one weapon.");
    	hero.removeWeapon(weaponService);
    	hero.direction();
    	hero.play(); 
    	
    	System.out.println("Login off.");
    }
}
