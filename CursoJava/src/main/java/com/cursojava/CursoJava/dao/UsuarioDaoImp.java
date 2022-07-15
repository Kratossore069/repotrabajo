package com.cursojava.CursoJava.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursojava.CursoJava.modelo.Usuario;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getUsers() {
        String sql = "from usuarios";
        return entityManager.createQuery(sql, Usuario.class).getResultList();
    }

}
