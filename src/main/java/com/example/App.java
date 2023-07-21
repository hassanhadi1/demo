package com.example;

import com.example.sqlite.Connexion;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Connexion.bdConnexion();
    }
}
