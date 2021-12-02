package interfacedemo;

public interface RBI {
   public Account openAccount(String name,String pannumber, String aadharnumber);
   void withdrawn(float amount);
   void viewbalance(String name);
   Account closeAccount();
}
