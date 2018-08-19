package testpack;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nissan.projecttest.Testserv;

public class Testadd {

	
	@Test
	public void int_ast_Test() {
		Testserv f=new Testserv();
		String num1="3";
		String num2="!";
		assertEquals("please type int or float",f.Add(num1,num2));
		
	}
	@Test
	public void float_3_12__4_13_Test() {
		Testserv f=new Testserv();
		String num1="3.12";
		String num2="4.13";
		assertEquals("7.25",f.Add(num1,num2));
		
	}
	@Test
	public void int_at_Test() {
		Testserv f=new Testserv();
		String num1="@";
		String num2="4.13";
		assertEquals("please type int or float",f.Add(num1,num2));
		
	}
	@Test
	public void int_0_9999__1_Test() {
		Testserv f=new Testserv();
		String num1="0.9999";
		String num2="1";
		assertEquals("1.9999",f.Add(num1,num2));
		
	}
	@Test
	public void int__Test() {
		Testserv f=new Testserv();
		String num1="_";
		String num2="1";
		assertEquals("please type int or float",f.Add(num1,num2));
		
	}
	@Test
	public void float_0_001__0_000001_Test() {
		Testserv f=new Testserv();
		String num1="0.001";
		String num2="0.000001";
		assertEquals("0.001001",f.Add(num1,num2)); 
	}
}
