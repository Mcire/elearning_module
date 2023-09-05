package com.groupeisi.repository;

public class UserRepository implements IUserRepository{
    @Override
    public String helloDao() {
        return "Donnees disponible";
    }
}
