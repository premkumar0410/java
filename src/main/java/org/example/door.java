package org.example;

public class door {
    public boolean islocked(String key){
        class lock{
            public boolean islocked(String key){
                if(key.equals("qwerty")){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return new lock().islocked(key);
    }
}
