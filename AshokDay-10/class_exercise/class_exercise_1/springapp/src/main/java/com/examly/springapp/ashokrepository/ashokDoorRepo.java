package com.examly.springapp.ashokrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.ashokmodel.ashokDoor;

// import jakarta.transaction.Transactiona

@Repository
public interface ashokDoorRepo extends JpaRepository<ashokDoor, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<ashokDoor> findByColor(String color);

    public List<ashokDoor> findByDoorType(String doortype);
}
