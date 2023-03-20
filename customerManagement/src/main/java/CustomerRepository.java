

/**
 *
 * @author chandika
 */
public interface CustomerRepository JpaRepository<Customer,Integer /*data type of primary key*/>{
    
@Query("select cus from Customer cus where cus.name=?1")
    List<Customer> findUserByName (String name);
    
    @Query ("select cus from Customer cus where cus.age = ?1")
    List<Customer> findUserByAge (int age);
    
    @Query("select cus from Customer cus where cus.name=?1 and cus.age=?2")
    List<Customer> findUserByNameAndAge (String name, int age);
}
