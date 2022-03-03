package db;

public class DbIntegrityException extends RuntimeException{
  public DbIntegrityException(String e) {
    super(e);
  }
}
