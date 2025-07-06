package example.hello_security;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DefaultResource {

    @GetMapping("/default/{param}")
    public ResponseEntity<String> getDefault(@PathVariable String param) {
        return ResponseEntity.ok("Default HTTP Response for param: [" + param + "]");
    }

    @GetMapping("/open")
    public ResponseEntity<String> getOpen() {
        return ResponseEntity.ok("Default HTTP Response on unsecured resource");
    }

    @GetMapping("/invisible")
    public ResponseEntity<Void> getInvisible() {
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/secret")
    public ResponseEntity<String> getSecret() {
        return ResponseEntity.ok("Response with SECRET information");
    }

}
