package com.bridgelabz.junituserregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserDetailsTest {
	UserRegistration register = new UserRegistration();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserValidationException {
		boolean isValid = register.validateName.validate("Ravi");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validateName.validate("ravi");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validateName.validate("ra");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws UserValidationException {
		boolean isValid = register.validateName.validate("Kumar");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validateName.validate("kumar");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validateName.validate("ku");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() throws UserValidationException {
		boolean isValid = register.validateEmail.validate("abc@gmail.com");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validateEmail.validate(".abc@gmail.com");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() throws UserValidationException {
		boolean isValid = register.validatePhoneNumber.validate("917620690906");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
		boolean isValid4 = register.validatePhoneNumber.validate("56545");
		Assert.assertFalse(isValid4);
	}
	@Test
	public void givenPassword_When1UpperCase_ShouldReturnTrue() throws UserValidationException {
		boolean isValid = register.validatePassword.validate("aBd5gd2@g");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() throws UserValidationException {
		boolean isValid = register.validatePassword.validate("aBd5gd2@g");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validatePassword.validate("b31fr7skd");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenEmail_WhenHaveConsecutiveDots_ShouldReturnFalse() throws UserValidationException {
		boolean isValid = register.validateEmail.validate("abc..23@gmail.com");
		Assert.assertFalse(isValid);
	}
	
}
