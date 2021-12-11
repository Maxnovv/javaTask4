package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
class User
{
    private String name;
    private String surname;
    private int age;
    public int GetAge()
    {
        return this.age;
    }
    public User(String surname,String name,int age)
    {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }
    public String getName()
    {
        return this.name;
    }
    public static ArrayList<User> createUsers()
    {
        ArrayList<User> a = new ArrayList<>();
        a.add(new User("Иванов","Алексей",23));
        a.add(new User("Петров","Дмитрий",45));
        a.add(new User("Сорокин","Алексей",36));
        a.add(new User("Андреев","Андрей",48));
        a.add(new User("Шаповалов","Олег",47));
        a.add(new User("Беликевич","Сергей",33));
        a.add(new User("Гаврилов","Евгений",33));
        a.add(new User("Волков","Кирилл",36));
        a.add(new User("Кошелев","Михаил",43));
        a.add(new User("Быков","Олег",33));
        return a;
    }
    public static Map<Integer,ArrayList<User>> processUsers(ArrayList<User> u)
    {
        Map<Integer,ArrayList<User>> m = new HashMap<>();
        for(User a : u)
        {
            if(m.containsKey(a.GetAge()))
            {
                ArrayList<User> h = m.get(a.GetAge());
                m.remove(a.GetAge());
                h.add(a);
                m.put(a.GetAge(),h);
            }
            else
            {
                ArrayList<User> q = new ArrayList<>();
                q.add(a);
                m.put(a.GetAge(),q);
            }
        }
        return m;
    }
    public static void printUserMap(Map<Integer,ArrayList<User>> m)
    {
        for(int a:m.keySet())
        {
            System.out.print(a + ": ");
            for(User u:m.get(a))
            {
                System.out.print(u.getName() + " ");
            }
            System.out.println();
        }
    }
}


class MyMap {
    public static Map<String, String> createMap() {
        HashMap<String,String> map = new HashMap<>();
        map.put("Иванов","Алексей");
        map.put("Петров","Дмитрий");
        map.put("Сорокин","Алексей");
        map.put("Андреев","Андрей");
        map.put("Шаповалов","Олег");
        map.put("Беликевич","Сергей");
        map.put("Гаврилов","Евгений");
        map.put("Волков","Кирилл");
        map.put("Кошелев","Михаил");
        map.put("Быков","Олег");
        return map;
    }
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashSet<String> b = new HashSet<>();
        for(String k : map.values())
        {
            int a = 0;
            for (String t : map.values())
            {
                if(k.equals(t))
                {
                    a++;
                }
            }
            if(a>1)
            {
                b.add(k);
            }
        }
        for(String k : b)
        {
            removeItemFromMapByValue(map,k);
        }
    }
    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashSet<String> b = new HashSet<>();
        for(String a : map.keySet())
        {
            if(map.get(a).equals(value))
            {
                b.add(a);
            }
        }
        for(String a : b)
        {
            map.remove(a);
        }

    }
    public static void printMap(Map<String,String> map){
        for(String a : map.keySet())
        {
            System.out.println(a + ":" + map.get(a));
        }
    }
}
public class Main {

    public static void main(String[] args) {



    }
}
