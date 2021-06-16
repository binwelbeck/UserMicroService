//package com.example.demo.model;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Version;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Null;
//import java.io.Serializable;
//import java.time.OffsetDateTime;
//import java.util.UUID;
//
//
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//public class UserDto implements Serializable {
//
//   static final long serialVersionUID = -5815566940065181210L;
//
//    @Null
//    private Long id;
//
//    @Null
//    private Integer version;
//
//    @Null
//    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
//    private OffsetDateTime lastModifiedDate;
//
//   @Null
//    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
//    private OffsetDateTime createdDate;
//
//  @NotBlank
//    private String username ;
//
//    @NotBlank
//    private String password ;
//
//  @NotBlank
// private String bank_id ;
//
// @NotBlank
//    private String role ;
//
//    private String registeredBy ;
//
//
//
//
//}
