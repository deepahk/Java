package com.java;
/*
* As long as we dont provide security manager, private members of class can be accessible. To access private members of class you should set setAccessible(true), this will allow you to access private members. To restrict access private members Keep below line of code in your immutable class constructor.

System.setSecurityManager(new SecurityManager());

This will throw AccessControlException when you try to set setAccessible(true).*/
public class ImmutableExample {
}
