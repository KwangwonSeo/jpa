package com.example.controller;

import com.example.model.SystemCode;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/common-api")
@Api(value = "common-api", description = "Common API")
public class CommonController {
	@ApiOperation(value = "남은 객실 상태 요청 - 한개 호텔에만 해당", nickname = "systemCodes", consumes = "application/json", notes = "test note")
	@ApiImplicitParams({})
	@RequestMapping(value = { "/v1.0/systemCode", "/v1.1/systemCode" }, method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = SystemCode.class),
	@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
	public ResponseEntity<SystemCode> selectSystemCode() {
		SystemCode response = SystemCode.builder()
			.enCodeName("TestCodeName")
			.build();
		return new ResponseEntity<SystemCode>(response, HttpStatus.OK);
	}
}
