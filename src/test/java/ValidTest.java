package java;

import staticorg.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;importmain.*;

class TestPasswordValidator {
	@TestvoidTestValidator() {
		PasswordValidator pv= newPasswordValidator();
		assertEquals(pv.validatePassword("12356"), false);//fail("Not yet implemented");
	}
}
