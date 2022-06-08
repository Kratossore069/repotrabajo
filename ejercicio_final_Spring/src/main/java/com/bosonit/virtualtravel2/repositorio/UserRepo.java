package com.bosonit.virtualtravel2.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo extends MongoRepository<User,Integer> {

    /**
     * FUNCIÓN QUE VALIDA LA ENTRADA DE UN USUARIO
     * @param username
     * @param password
     * @return true or false
     */
    public boolean validar(String username,String password){
        return (username.equals("admin") && password.equals("admin"));
    }
}
