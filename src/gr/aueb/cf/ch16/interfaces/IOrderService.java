package gr.aueb.cf.ch16.interfaces;

import java.time.LocalDateTime;

public interface IOrderService {

    void insertOrder(String address, String lastName, String firstName,
                     String phoneNumber, LocalDateTime timestamp, String item, int quantity);
    void upDateOrder(Long id, String address, String lastName, String firstName,
                     String phoneNumber, LocalDateTime timestamp, String item, int quantity);
    void deleteOrder(Long id);
    String getIOrder(Long id);




}
