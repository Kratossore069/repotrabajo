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
    @Transactional
    public List<Usuario> getUsers() {
        String sql = "FROM Usuario";
        return entityManager.createQuery(sql , Usuario.class).getResultList();
    }

    @Override
    public void eliminar(int id) {
        Usuario userDelete = entityManager.find(Usuario.class, id);
        entityManager.remove(userDelete);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        entityManager.merge(usuario);
    }

}
