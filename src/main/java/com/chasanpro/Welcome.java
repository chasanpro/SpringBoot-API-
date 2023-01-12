package com.chasanpro;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/welcome")

public class Welcome {
  @GetMapping

 public ResponseEntity<String> welcome(){
  return ResponseEntity.ok("There are no Strings on me ");}
  @GetMapping("bye")
  public ResponseEntity<String> goodboye(){
return ResponseEntity.ok("I'm the best ");
  }
@GetMapping("ultron")
  public ResponseEntity<String> ultron(){
    return ResponseEntity.ok("My Vision ");
  }
 
}
