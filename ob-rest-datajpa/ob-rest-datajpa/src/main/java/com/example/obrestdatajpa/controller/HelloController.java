package com.example.obrestdatajpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("/hola") // con esto coloccaremos la dirección de la url
    public String holaMundo(){
    return "hola mundo, como estas?, estoy probando el texto, hasta luego";
} // aca esta el texto que estara en la URL

    @GetMapping("/bootstrap")
    public String bootstrap(){
    return """
             <!doctype html>
             <html lang="en">
               <head>
                 <meta charset="utf-8">
                 <meta name="viewport" content="width=device-width, initial-scale=1">
                 <title>Bootstrap demo</title>
               </head>
               <body>
               
                 <h1>Hello, world!</h1>
                 
               </body>
             </html>
            """;
    }


}
