package io.github.henriquempereira.exexception.model;

import io.github.henriquempereira.exexception.exception.InvalidPasswordException;

public class Password {

    private String password;

    public Password(String password) {
        this.password = password;
    }

    public void verifyPassword() {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
        if(this.password.length() < 8) {
            throw new InvalidPasswordException("A senha é menor que 8 caracteres!");
        } else if(this.password.length() > 16) {
            throw new InvalidPasswordException("A senha possui mais que 16 caracteres!");
        } else if(!this.password.matches(regex)){
            throw new InvalidPasswordException("A senha não possui todas as exigências!");
        }
    }

    @Override
    public String toString() {
        return this.password;
    }
}
