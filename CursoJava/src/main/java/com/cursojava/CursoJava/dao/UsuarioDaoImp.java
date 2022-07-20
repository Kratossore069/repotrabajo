package com.cursojava.CursoJava.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursojava.CursoJava.modelo.Usuario;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

@Repository
@Transactional //Se ejecutan de manera de transacción con mysql para evitar sobreescritura
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> getUsers() {
        String sql = "FROM Usuario";
        return entityManager.createQuery(sql, Usuario.class).getResultList();
    }

    @Override
    public void eliminar(int id) {
        Usuario userDelete = entityManager.find(Usuario.class, id);
        entityManager.remove(userDelete);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        entityManager.persist(usuario);
    }

    @Override
    public Usuario obtenerUsuarioPorCredenciales(Usuario usuario) {

        String sql = "FROM Usuario where email=:email";
        List<Usuario> lista = entityManager.createQuery(sql, Usuario.class)
                .setParameter("email", usuario.getEmail())
                .getResultList();

        if(lista.isEmpty()){
            return null;
        }

        String passwordHashed=lista.get(0).getPassword();
        
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        if(argon2.verify(passwordHashed,usuario.getPassword())){
            return lista.get(0);
        }
        return null;
    }

}
