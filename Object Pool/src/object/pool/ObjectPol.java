/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.pool;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Estudiante
 */
public abstract class ObjectPol<T> {

  private Set<T> available = new HashSet<>();
  private Set<T> inUse = new HashSet<>();

  protected abstract T create();

  /**
   * Checkout object from pool
   */
  public synchronized T checkOut() {
    if (available.isEmpty()) {
      available.add(create());
    }
    T instance = available.iterator().next();
    available.remove(instance);
    inUse.add(instance);
    return instance;
  }

  public synchronized void checkIn(T instance) {
    inUse.remove(instance);
    available.add(instance);
  }

  @Override
  public synchronized String toString() {
    return String.format("Pool available=%d inUse=%d", available.size(), inUse.size());
  }
}
