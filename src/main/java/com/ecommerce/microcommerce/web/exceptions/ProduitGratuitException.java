package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// je l'ai fait dans la partie 1 désolé.
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends Throwable {


    public ProduitGratuitException(String s) {
    }
}
