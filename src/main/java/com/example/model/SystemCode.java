package com.example.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SystemCode {
	private String code;
	private String enCodeName;
	private String koCodeName;
	private String enDescription;
	private String koDescription;
	private String parentCode;
	private String useYn;
	private String reserved1;
	private String reserved2;
	private String registrationId;
	private LocalDateTime registrationDate;
	private String modificationId;
	private LocalDateTime modificationDate;
	private Integer sortNo;
	private String jaCodeName;
	private String jaDescription;
}
