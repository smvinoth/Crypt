package com.crypt.controller;
import org.springframework.web.bind.annotation.RestController;

import com.crypt.logic.CryptLogic;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
 
@RestController
public class CryptController implements ErrorController{
 
 @RequestMapping("/")
 public String welcome() {
 return "Welcome to Crypt \n To Encrypt use \\encrypt?data=\"Your String\" \n To Decrypt use \\decrypt?data=\"Your String\"";
 }
 
 @RequestMapping("/encrypt")
 public String encrypt(String data) {
	  	 return CryptLogic.encrypt(data);
 }
 
 @RequestMapping("/decrypt")
 public String decrypt(String data) {
	  	 return CryptLogic.decrypt(data);
 }
 
 @RequestMapping("/error")
 public String Error() {
		 return "Please check, if you are providing proper Parameters. If error persists contact admin";
 }

@Override
public String getErrorPath() {
	return "/error";
}
 
 
 
}