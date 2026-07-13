package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import services.AuthService;

public class AuthTest extends BaseTest {

    @Test
    public void generateToken() {

        String token = AuthService.getToken();

        System.out.println("Generated Token: " + token);
    }
}